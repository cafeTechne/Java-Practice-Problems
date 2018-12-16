/**
 * The Application class contains the code for Lab 10, CTP150, Section 003.
 * This application calculates grades, demonstrating interfaces and polymorphism.
 *
 */


	
	/**
	 * Essay class determines the total score a student receives for an essay. 
	 * The student's essay score can be up to 100 and is broken down between Grammar: 30pts,
	 * Spelling: 20 points, Correct length: 20 points, Content 30 points
	 */
    
	//DO NOT write a service class inside of another class ----------------------------------- -10
   public class Essay extends GradedActivity{
   	
      private double grammar = 0;
      private double spelling = 0;
      private double correctLength = 0;
      private double content = 0;
   	
   	/**
   	 * default constructor sets all private data members to 0.
   	 */
      public Essay() {
         this.grammar = 0;
         this.spelling = 0;
         this.correctLength = 0;
         this.content = 0;
      }
   	
   	
   	/**
   	 * The overloaded constructor takes grammar, spelling, correctLength and content in as parameters.
   	 * It then conducts basic bounds check within the setter calls to ensure that the values entered are valid.
   	 * 
   	 * @param grammar A double representing the points earned for grammar in the essay. Out of 30.
   	 * @param spelling A double representing the points earned for spelling in the essay. Out of 20.
   	 * @param correctLength A double representing the points earned for correct length in the essay. Out of 20.
   	 * @param content A double representing the points earned for content in the essay. Out of 30.
   	 */
   	
      public Essay(double grammar, double spelling, double correctLength, double content) {
      	
         setGrammar(grammar);
         setSpelling(spelling);
         setCorrectLength(correctLength);
         setContent(content);
      	
         super.setScore(determineScore());
      }
   	
   	/**
   	 * A public method that determines the overall grade for the essay,
   	 * as a function of the values in each of the subsections of the rubric.
   	 * @return a double representing the overall grade, out of 100 possible points.
   	 */
   	
      public double determineScore() {
         return (
            	(this.grammar) +
            	(this.spelling) +
            	(this.correctLength) +
            	(this.content)
               );
      }
   	
   	/**
   	 * Sets the grammar data field after validating that the score is within an acceptable range.
   	 * @param grammar a double representing the grammar score, no greater than 30 or less than 0.
   	 */
      public void setGrammar(double grammar) {
         if(this.grammar >30 & this.grammar < 0) {   //use &&, not & -------------------------------------- -1
            System.out.println("User, grammar can not be worth more than 30 points)");
            System.exit(1);
         }
         else this.grammar = grammar;
      }
   			
   	/**
   	 * Returns a double representing the grammar score of the essay object.
   	 * @return a double representing the grammar score the essay object.
   	 */
   			
      public double getGrammar() {
         return this.grammar;
      }
   	
   	/**
   	 * Sets the spelling data field after validating that the score is within an acceptable range.
   	 * @param grammar a double representing the spelling score, no greater than 30 or less than 0.
   	 */
   	
      public void setSpelling(double spelling) {
         if(this.spelling >20 & this.spelling < 0) {  //same as above ---------------------------------------
            System.out.println("User, spelling can not be worth more than 20 points)");
            System.exit(1);
         }
         else this.spelling = spelling;
      }
   	
   	/**
   	 * Returns a double representing the spelling score of the essay object.
   	 * @return a double representing the spelling score the essay object.
   	 */
   	
      public double getSpelling() {
         return this.spelling;
      }
   	
   	/**
   	 * Sets the correctLength data field after validating that the score is within an acceptable range.
   	 * @param grammar a double representing the correct length score, no greater than 30 or less than 0.
   	 */
   	
      public void setCorrectLength(double correctLength) {
         if(this.correctLength >20 & this.correctLength < 0) {  //same as above -----------------------------
            System.out.println("User, correct length can not be worth more than 20 points)");
            System.exit(1);
         }
         else this.correctLength = correctLength;
      }
   	
   	/**
   	 * Returns a double representing the correct length score of the essay object.
   	 * @return a double representing the correct length score the essay object.
   	 */
   	
      public double getCorrectLength() {
         return this.correctLength;
      }
   	
   	/**
   	 * Sets the content data field after validating that the score is within an acceptable range.
   	 * @param grammar a double representing the content score, no greater than 30 or less than 0.
   	 */
   	
      public void setContent(double content) {
         if(this.content >30 & this.content < 0) {   //same as above ------------------------------------
            System.out.println("User, content can not be worth more than 30 points)");
            System.exit(1);
         }
         else this.content = content;
      }
   	
   	/**
   	 * Returns a double representing the content score of the essay object.
   	 * @return a double representing the content score the essay object.
   	 */
   	
      public double getContent() {
         return this.content;
      }
   	
   }
	
	
	/**
	 * A class that has a GradedActivity array named grades that has 
	 * four elements, one for each of the following assignments:
	 *
	 * 1) A lab activity that is observed by the teacher,
	 * 2) A pass/fail exam that has 10 questions. Min. Score = 70;
	 * 3) An essay that is assigned a numeric score.
	 * 4) A final exam that has 50 questions.
	 */
	
   public class CourseGrades implements IAnalyzable{
   	
      private GradedActivity grades[] = new GradedActivity[4];
   	
   	/**
   	 * Constructor takes a series of GradedActivity objects, 
   	 * demonstrating polymorphism, and assign them to elements
   	 * of the array, corresponding to the following convention:
   	 * index 0: is a lab activity, index 2: is a pass/fail exam,
   	 * index: 3 is an essay, index: 4 is a final exam.
   	 *  
   	 * @param lab A GradedActivity object holding a students score for the lab activity.
   	 * @param exam A PassFailExam object holding a students score for the pass/fail exam.
   	 * @param essay A Essay object holding a students score for the essay.
   	 * @param finalExam A FinalExam object holding a students score for the Final Exam.
   	 */
      public CourseGrades(GradedActivity lab, PassFailExam exam, Essay essay, FinalExam finalExam) {
         setLab(lab);
         setPassFailExam(exam);
         setEssay(essay);
         setFinalExam(finalExam);
         this.toString();
      }
   	/**
   	 * Calculates the average of all of the scores entered and returns a double representing that score.
   	 * @return double the average of all of the scores entered;
   	 */
      public double getAverage() {   //always use loop ------------------------------ -1
         double temporarySum = (grades[0].getScore() + 
            	grades[1].getScore() +
            	grades[2].getScore() +
            	grades[3].getScore() 
            	);
         return temporarySum/4;
      }
   	/**
   	 * Calculates the highest of all of the scores entered and returns a double representing that score.
   	 * @return double the highest of all of the scores entered;
   	 */
      public GradedActivity getHighest(){
         double highestScore = grades[0].getScore();
         int objectIndex = 0;
         for(int i = 1; i<grades.length; i++) {
            if(grades[i].getScore() > highestScore) {
               highestScore = grades[i].getScore();
               objectIndex = i;
            }
         }
         return grades[objectIndex];
      }
   	/**
   	 * Calculates the lowest of all of the scores entered and returns a double representing that score.
   	 * @return double the lowest of all of the scores entered;
   	 */
      public GradedActivity getLowest(){
         double lowestScore = grades[0].getScore();
         int objectIndex = 0;
         for(int i = 1; i<grades.length; i++) {
            if(grades[i].getScore() < lowestScore) {
               lowestScore = grades[i].getScore();
               objectIndex = i;
            }
         }
         return grades[objectIndex];
      }
   	
   	/**
   	 * A setter method to store a GradedActivity object representing the lab score in the first index of the array.
   	 * @param lab A GradedActivity object representing the lab score in the first index of the array.
   	 */
   	
      public void setLab(GradedActivity lab) {
         grades[0] = lab;
      }
   	
   	/**
   	 *  A setter method to store a PassFailExam object representing the passfail exam in the second index of the array.
   	 * @param exam A PassFailExam object representing the passfail exam in the second index of the array.
   	 */
   	
      public void setPassFailExam(PassFailExam exam) {
         grades[1] = exam;
      }
   	
   	/**
   	 * A setter method to store an Essay object in the third index of the array.
   	 * @param essay An Essay object to be stored in the third index of the array.
   	 */
   	
      public void setEssay(Essay essay) {
         grades[2] = essay;
      }
   	
   	/**
   	 * A setter method to store a FinalExam object in the fourth index of the array.
   	 * @param finalExam A FinalExam object to be stored in the fourth index of the array.
   	 */
   	
      public void setFinalExam(FinalExam finalExam) {
         grades[3] = finalExam;
      }
   	
   	/**
   	 * The to String method returns a string of the values of the respective fields,
   	 * as determined in the Lab 10 specification.
   	 */
      public String toString() {
         return "Lab Score: "+ grades[0].getScore() + " Grade: " + grades[0].getGrade()
            	+ "\n Pass/Fail Exam Score: " + grades[1].getScore() + " Grade: " + grades[1].getGrade()
            	+ "\n Essay Score: " + grades[2].getScore() + "  Grade: " + grades[2].getGrade()
            	+ "\n Final Exam Score: " + grades[3].getScore() + grades[3].getGrade()
            	+ "\n \n Average score: " + this.getAverage()
            	+ "\n Highest score: " + this.getHighest().getScore()
            	+ "\n Lowest score: " + this.getLowest().getScore()
            	;
      }
   }
	
	
	/**
	 * The IAnalyzable interface is implemented by courseGrades class:
	 * It enforces the following behaviors: getAverage(), getHighest(),
	 * and getLowest()... which sorts through an array of GradedAcivity 
	 * objects and returns the average score, the highest and the lowest 
	 * scores, respectively.
	 *
	 */
	
   public interface IAnalyzable{
      double getAverage();
      GradedActivity getHighest();
      GradedActivity getLowest();
   }
	

	
	
	
	/**
	   A class that holds a grade for a graded activity.
	*/

   public class GradedActivity 
   {
      private double score;  // Numeric score
   
      
      public GradedActivity() {
         this.score = 0;
      }
      
      /**
         The setScore method sets the score field.
         @param s The value to store in score.
      */
   
      public void setScore(double s)
      {
         score = s;
      }
   
      /**
         The getScore method returns the score.
         @return The value stored in the score field.
      */
   
      public double getScore()
      {
         return score;
      }
   
      /**
         The getGrade method returns a letter grade
         determined from the score field.
         @return The letter grade.
      */
   
      public char getGrade()
      {
         char letterGrade;
      
         if (score >= 90)
            letterGrade = 'A';
         else if (score >= 80)
            letterGrade = 'B';
         else if (score >= 70)
            letterGrade = 'C';
         else if (score >= 60)
            letterGrade = 'D';
         else
            letterGrade = 'F';
      
         return letterGrade;
      }
   }




	/**
	This class determines the grade for a final exam.
	*/
	
   public class FinalExam extends GradedActivity
   {
      private int numQuestions;  // Number of questions
      private double pointsEach; // Points for each question
      private int numMissed;     // Questions missed
   
   /**
      The constructor sets the number of questions on the
      exam and the number of questions missed.
      @param questions The number of questions.
      @param missed The number of questions missed.
   */
   
      public FinalExam(int questions, int missed)
      {
         double numericScore;  // To hold a numeric score
      
      // Set the numQuestions and numMissed fields.
         numQuestions = questions;
         numMissed = missed;
      
      // Calculate the points for each question and
      // the numeric score for this exam.
         pointsEach = 100.0 / questions;
         numericScore = 100.0 - (missed * pointsEach);
      
      // Call the inherited setScore method to
      // set the numeric score.
         setScore(numericScore);
      }
   
   /**
      The getPointsEach method returns the number of
      points each question is worth.
      @return The value in the pointsEach field.
   */
   
      public double getPointsEach()
      {
         return pointsEach;
      }
   
   /**
      The getNumMissed method returns the number of 
      questions missed.
      @return The value in the numMissed field.
   */
   
      public int getNumMissed()
      {
         return numMissed;
      }
   }
	
	/**
	This class holds a numeric score and determines
	whether the score is passing or failing.
	*/
	
   public class PassFailActivity extends GradedActivity
   {
      private double minPassingScore; // Minimum passing score
   
   /**
      The constructor sets the minimum passing score.
      @param mps The minimum passing score.
   */
   
      public PassFailActivity(double mps)
      {
         minPassingScore = mps;
      }
   
   /**
      The getGrade method returns a letter grade determined
      from the score field. This method overrides the
      superclass method.
      @return The letter grade.
   */
   
      @Override
      public char getGrade()
      {
         char letterGrade;
      
         if (super.getScore() >= minPassingScore)
            letterGrade = 'P';
         else
            letterGrade = 'F';
      
         return letterGrade;
      }
   }
	/**
	This class determines a passing or failing grade for
	an exam.
	*/
	
   public class PassFailExam extends PassFailActivity
   {
      private int numQuestions;  // Number of questions
      private double pointsEach; // Points for each question
      private int numMissed;     // Number of questions missed
   
   /**
      The constructor sets the number of questions, the
      number of questions missed, and the minimum passing
      score.
      @param questions The number of questions.
      @param missed The number of questions missed.
      @param minPassing The minimum passing score.
   */
   
      public PassFailExam(int questions, int missed, 
                       double minPassing)
      {
      // Call the superclass constructor.
         super(minPassing);
      
      // Declare a local variable for the score.
         double numericScore;
      
      // Set the numQuestions and numMissed fields.
         numQuestions = questions;
         numMissed = missed;
      
      // Calculate the points for each question and
      // the numeric score for this exam.
         pointsEach = 100.0 / questions;
         numericScore = 100.0 - (missed * pointsEach);
      
      // Call the superclass's setScore method to
      // set the numeric score.
         setScore(numericScore);
      }
   
   /**
      The getPointsEach method returns the number of
      points each question is worth.
      @return The value in the pointsEach field.
   */
   
      public double getPointsEach()
      {
         return pointsEach;
      }
   
   /**
      The getNumMissed method returns the number of 
      questions missed.
      @return The value in the numMissed field.
   */
   
      public int getNumMissed()
      {
         return numMissed;
      }
   }

   public class Application {  //this class should be stand along from other classes ----------------------

	   /**
		 * The main method demonstrates the building of a CourseGrades array, using PassFailExam,
		 * Essay, FinalExam, and GradedActivity objects. It demonstrates polymorphism and the usage of interfaces.
		 * @param args
		 */
		
	   public static void main(String[] args) {  //please write main() in a separate class ------------------
	   		
	   		
	      GradedActivity gradedActivity = new Application(). new GradedActivity(); 
	      gradedActivity.setScore(85);
	   		
	   		
	      PassFailExam passFailExam = new Application(). new PassFailExam(20, 3, 70);
	   
	      Essay essayExam = new Application(). new Essay(25, 18, 17, 20);
	   		
	      FinalExam finalExam = new Application(). new FinalExam(50, 10);
	   		
	      CourseGrades courseGrades = new Application(). new CourseGrades(gradedActivity, passFailExam, essayExam, finalExam);
	   		
	      System.out.println(courseGrades.toString());
	   }
			
	
   
}
