import edu.duke.*;
import java.io.File;

public class PerimeterAssignmentRunner {
    public double getPerimeter (Shape s) {
        // Start with totalPerim = 0
        double totalPerim = 0.0;
        // Start wth prevPt = the last point 
        Point prevPt = s.getLastPoint();
        // For each point currPt in the shape,
        for (Point currPt : s.getPoints()) {
            // Find distance from prevPt point to currPt 
            double currDist = prevPt.distance(currPt);
            // Update totalPerim by currDist
            totalPerim = totalPerim + currDist;
            // Update prevPt to be currPt
            prevPt = currPt;
        }
        // totalPerim is the answer
        return totalPerim;
    }

    public int getNumPoints (Shape s) {
        // Put code here
        int count = 0;
        for (Point p : s.getPoints()){
              count++;
        }
        return count;
    }

    public double getAverageLength(Shape s) {
        // Put code here
        double length = getPerimeter(s);
        double count = (double) getNumPoints(s);
        double avg = length / count;
        return avg;
    }

    public double getLargestSide(Shape s) {
        // Put code here
        double largest = 0;
        Point prevPt = s.getLastPoint();
        for (Point currPt: s.getPoints()){
            double distance = prevPt.distance(currPt);
            if ( distance > largest ){
                largest = distance;
            }
        }
        
        return largest;
    }

    public double getLargestX(Shape s) {
        // Put code here
        double largestX = 0;
        
        for (Point p : s.getPoints()){
            if ( p.getX() > largestX ){
                largestX = (double) p.getX();
            }
        }
        return largestX;
    }

    public double getLargestPerimeterMultipleFiles() {
        // Put code here
        //DirectoryResource allows the user to choose one or more files 
        //from a directory (or folder) with a file selection dialog box 
        //by using the method selectedFiles. These files can then be iterated over using a for loop.
        // return largestPerimeter
        
        
        double largestPerim = 0;
        DirectoryResource dr = new DirectoryResource();
        for(File f : dr.selectedFiles()){
            FileResource fr = new FileResource(f);
            Shape s = new Shape(fr);
            double shapePerim = getPerimeter(s);
            if ( shapePerim > largestPerim){
                largestPerim = shapePerim;
            }
        }
        return largestPerim;
    }

    public String getFileWithLargestPerimeter() {
        // Put code here
        double largestPerim = 0;
        File largestFile = null;
        DirectoryResource dr = new DirectoryResource();
        //File temp = null;    // replace this code
         for(File f : dr.selectedFiles()){
            FileResource fr = new FileResource(f);
            Shape s = new Shape(fr);
            double shapePerim = getPerimeter(s);
            if ( shapePerim > largestPerim){
                largestPerim = shapePerim;
                largestFile = f;
            }
        }
        return largestFile.getName();
    }

    public void testPerimeter () {
        FileResource fr = new FileResource();
        Shape s = new Shape(fr);
        double length = getPerimeter(s);
        System.out.println("perimeter = " + length);
        int numpoints = getNumPoints(s);
        System.out.println("Number of points = " + numpoints);
        double avglength = getAverageLength(s);
        System.out.println("Average legth of all the sides = " + avglength);
        double largestSide = getLargestSide(s);
        System.out.println("The length of the largest side is = " + largestSide);
        double largestX = getLargestX(s);
        System.out.println("The largest X is = " + largestX);
    }
    
    public void testPerimeterMultipleFiles() {
        // Put code here
        double largestPerimMultipleF = getLargestPerimeterMultipleFiles();
        System.out.println("The largest perimeter over the selected files is " + largestPerimMultipleF);
    }

    public void testFileWithLargestPerimeter() {
        // Put code here
        String fileWithLargestPerim = getFileWithLargestPerimeter();
        System.out.println("The file with the largest perimeter is " + fileWithLargestPerim);
    }

    // This method creates a triangle that you can use to test your other methods
    public void triangle(){
        Shape triangle = new Shape();
        triangle.addPoint(new Point(0,0));
        triangle.addPoint(new Point(6,0));
        triangle.addPoint(new Point(3,6));
        for (Point p : triangle.getPoints()){
            System.out.println(p);
        }
        double peri = getPerimeter(triangle);
        System.out.println("perimeter = "+peri);
    }

    // This method prints names of all files in a chosen folder that you can use to test your other methods
    public void printFileNames() {
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            System.out.println(f);
        }
    }

    public static void main (String[] args) {
        PerimeterAssignmentRunner pr = new PerimeterAssignmentRunner();
        pr.testPerimeterMultipleFiles();
    }
}
