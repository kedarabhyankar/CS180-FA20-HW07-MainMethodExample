public class MainMethodExample {
  
  public static void main(String[] args){
    Student student = new Student("Kedar", 20, new String[]{"Computer Science"});
    Course problemSolving = new Course("CS", 180, "Computer Science", 4, null, "Problem Solving and Object-Oriented Programming");
    Course discreteMath = new Course("CS", 182, "Computer Science", 3, new Course[]{problemSolving}, "Foundations of Computer Science");
    Course cProgramming = new Course("CS", 240, "Computer Science", 3, new Course[]{problemSolving}, "Programming in C");
    Course arch = new Course("CS", 250, "Computer Science", 4, new Course[]{problemSolving, discreteMath, cProgramming}, "Computer Architecture");
    Course dataStructures = new Course("CS", 251, "Computer Science", 3, new Course[]{problemSolving, discreteMath, cProgramming}, "Data Structures and Algorithms");
    Course calcOne = new Course("MA", 161, "Mathematics", 5, null, "Calculus 1");
    Course calcTwo = new Course("MA", 162, "Mathematics", 5, new Course[]{calcOne}, "Calculus 2");
    Course calcThree = new Course("MA", 261, "Mathematics", 4, new Course[]{calcOne, calcTwo}, "Calculus 3"); 
    
    int[][] geoTimeArray = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 1, 1, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 1, 1, 0, 0, 0, 0}, 
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
    
    int[][] sysTimeArray = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
    
    int[][] sweTimeArray = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 1, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
    
    int[][] linearTimeArray = new int[][]{{0, 0, 0, 0, 1, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 1, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 1, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
    
    int[][] statTimeArray = new int[][]{{0, 0, 0, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 1, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 1, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
    
    Course geo = new Course("EAPS", 106, "Earth, Atmosphere, and Planetary Sciences", "Andy Freed", 3, null, "Geosciences in the Cinema", geoTimeArray);
    Course sys = new Course("CS", 252, "Computer Science", "Gustavo Rodriguez-Rivera", 4, new Course[]{problemSolving, discreteMath, cProgramming, arch, dataStructures}, "Systems Programming", sysTimeArray);
    Course swe = new Course("CS", 307, "Computer Science", "Roopsha Samanta", 3, new Course[]{problemSolving, discreteMath, cProgramming, arch, dataStructures}, "Software Engineering 1", sweTimeArray);
    Course linear = new Course("MA", 265, "Mathematics", "Rongqin Ye", 4, new Course[]{calcOne, calcTwo, calcThree}, "Linear Algebra", linearTimeArray);
    Course stat = new Course("STAT", 350, "Statistics", "Siddharta Nandy", 4, null, "Introduction to Statistics", statTimeArray);
    
    //you can use these and now work with createSchedule, addCourse, etc.
  }
}
