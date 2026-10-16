// //Session 2

// class Basics{
//     public static void main(String[]args)
//     {
//         //Implict type(IT CONVERTS DATATYPE AUTOMATICALLY)
//         // int a = 1;
//         // int b = 3;

//         // a = b;
//         // System.out.println(a);


//         // //explict function(MANUAL PUT THE DATTAYPE)
//         // int d = 5;
//         // float e = 7.5f;

//         // d = (int)e;
//         // System.out.println(d);


//         // //Homework :- Print the sum of N natural nummbers hint: (N*(N+1))/2
//         int N = 8;
//         int sum = (N*(N+1))/2;
//         System.out.println("The sum of N natural number is : " + sum);
//     }
// }



// Imagine we have a table called students with these columns:

// student_id (integer)

// student_name (text)

// age (integer)

// grade (text)

// Write a SQL query to:
// "Show me all the information about all students in the table."

// Give it a try! What SQL statement would you write?

// FROM students;
// SELect(student_id,student_name,age,text);

Using the same students table:

Write a SQL query to:
"Show me the names and ages of students who are 18 years old or older."

SELECT student_name , student_age,
Where student_age>=18;
FROM students;