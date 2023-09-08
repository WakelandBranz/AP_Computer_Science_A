/*
* Module Three Lesson Two Assignment
 * Wakeland Branz
 * Date: 09/07/2023
 * Seaforth High School
 * Basic Arithmetic Program
 *
 * Description:  Basic mathematics program which does simple math and stores it in variables.
 * Difficulties:  Organizing all of my print statements as neatly and as compact as possible.   
 * What I Learned:  I learned basic Java mathematical syntax.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        // introductory print
        System.out.print("By: Wakeland Branz\n - Module 3 Lesson 2 Assignment - \n");

        // initialize all integers with their respective math
        int length = 5, width = 4, perimeter = 2 * (length + width), area = length * width;
        int bigPerimeter = 2 * ((length + 1) + (width + 1)), bigArea = (length + 1) * (width + 1);

        // print all variables neatly
        System.out.print("Length -> " + length + "\nWidth -> " + width + "\nPerimeter -> " + perimeter + "\nArea -> " + area + "\n");
        System.out.print("bigPerimeter -> " + bigPerimeter + "\nbigArea -> " + bigArea + "\n");
    }
}
/*
 * Sample output:
 * Length -> 5    
 * Width -> 4     
 * Perimeter -> 18
 * Area -> 20     
 * bigPerimeter -> 22
 * bigArea -> 30     
 */
