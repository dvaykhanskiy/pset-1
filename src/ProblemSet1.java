/**
 * Problem Set 1.
 *
 * It's time to put your skills to the test. This problem set focuses on using
 * primitive data types, variables, and basic operators and functions.
 *
 * The specifications for each exercise are outlined below. Your output is
 * expected to meet requirements set forth in this section (as well as the
 * Deliverables section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

public class ProblemSet1 {

    public static void main(String[] args) {

        /*
         * Exercise 1.
         *
         * What is the area (in square millimeters) of an 8.5-by-11-inch sheet of paper?
         */
        final double SHEET_LENGTH = 11;
        final double SHEET_WIDTH = 8.5;
        final double CONVERSION = 25.4;
        double lengthMilli = SHEET_LENGTH * CONVERSION;
        double widthMilli = SHEET_WIDTH * CONVERSION;
        double area = lengthMilli * widthMilli;
        System.out.printf("\n%,.2f square millimeters.\n", area);


        /*
         * Exercise 2.
         *
         * What is the perimeter (in centimeters) of an 8.5-by-11-inch sheet of paper?
         */
         final double CONVERSION2 = 2.54;
         double lengthCenti = SHEET_LENGTH * CONVERSION2;
         double widthCenti = SHEET_WIDTH * CONVERSION2;
         double perimeter = (2 * widthCenti) + (2 * lengthCenti);
         System.out.printf("\n%,.2f centimeters. \n", perimeter);


        /*
         * Exercise 3.
         *
         * What is the length of the diagonal (in inches) between two corners on an 8.5-
         * by-11-inch sheet of paper?
         */
         double diagonal = Math.sqrt((SHEET_WIDTH * SHEET_WIDTH) + (SHEET_LENGTH * SHEET_LENGTH));
         System.out.printf("\n%,.2f inches. \n", diagonal);


        /*
         * Exercise 4.
         *
         * Given the grading policy and the homework, quiz, and test grades I received,
         * what marking period grade will I get?
         */

        int homework1 = 88;
        int homework2 = 91;
        int homework3 = 0;
        int quiz1 = 84;
        int quiz2 = 89;
        int quiz3 = 93;
        int test1 = 74;
        int test2 = 87;
        int test3 = 82;
        final double HW_WEIGHT = 0.15;
        final double QUIZ_WEIGHT = 0.35;
        final double TEST_WEIGHT = 0.50;
        double hwGrade = (homework1 + homework2 + homework3) * HW_WEIGHT / 3;
        double quizGrade = (quiz1 + quiz2 + quiz3) * QUIZ_WEIGHT / 3;
        double testGrade = (test1 + test2 + test3) * TEST_WEIGHT / 3;
        double finalGrade = hwGrade + quizGrade + testGrade;
        System.out.printf("\n%.2f%%.\n", finalGrade);


        /*
         * Exercise 5.
         *
         * I make $12.50/hour working as a cashier at a local supermarket. How much money
         * will I make this week?
         */
         final double WAGE = 12.50;
         final double HOURS_MONDAY = 7.5;
         final double HOURS_TUESDAY = 8;
         final double HOURS_WEDNESDAY = 10.5;
         final double HOURS_THURSDAY = 9.5;
         final double HOURS_FRIDAY = 6;
         final double HOURS_SATURDAY = 11.5;
         double weeklyIncome = (HOURS_SATURDAY + HOURS_FRIDAY + HOURS_THURSDAY + HOURS_WEDNESDAY + HOURS_TUESDAY + HOURS_MONDAY) * WAGE;
         System.out.printf("\n$%.2f\n", weeklyIncome);

        /*
         * Exercise 6.
         *
         * What is my take-home pay each check?
         */



        /*
         * Exercise 7.
         *
         * I am planning a class trip next month. How many buses do I need, and how many
         * people will be on the last bus?
         */



        /*
         * Exercise 8.
         *
         * What is the surface area of a standard Cornhole board?
         */



        /*
         * Exercise 9.
         *
         * Are the years 2020, 2100, and 2400 leap years?
         */



        /*
         * Exercise 10.
         *
         * What is the wind chill?
         */



    }
}
