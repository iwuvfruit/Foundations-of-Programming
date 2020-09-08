# Foundations-of-Programming
COMP202 @McGill

Fairly Easy problems. 
Easier than leetcode easy problems. 

I 100% made it mine. I can 100% solve all again without any help. 

What I learnt
From A1)  
public static void main(String[] args):  args[0] means the first of given argument. not the file name. also note that it's type is String[]. To use it as int, must parse int such that int a = Integer.parseInt(args[0]);

when providing arguments to run configuration, format it this way:
"5"
"5"
"1"
//each argument takes one line. 

Always test your code. check my test Case , expected outputs, actual outputs  =>repeat. 

From A2)
after method is done, the stack is removed. the change is unsaved if not returning. 

to generate a random value: 
import java.util.Random;
Random r = new Random();
int result = r.nextInt(high-low) + low; //low is inclusive and high is exclusive 
int result = r.nextInt(high - low + 1) + low;// both inclusive 
double result = low + (high - low) * r.nextDouble();

to generate a scanner:
import java.util.Scanner;
  Scanner myObj = new Scanner(System.in);  // Create a Scanner object
  System.out.println("Enter username");
  String userName = myObj.nextLine();  // Read user input

if x is point or x is 7 then get out of the loop:
while(x != point && x != 7) {//this makes sense if x is 7 then stop the loop, same for if x is point.  that means if one of them is false then stop the loop. thus and, not or.

From A3)
when reversing, instead of just creating a new string and loop through to insert one by one we can use two pointers method::
//strings are immutable so how are we going to mutate it?
	  //we can turn it into array which is mutable then use two pointers method 
	  //so it's O(n) space when turning string into array(if char[] given then O(1) space
	  //and O(n) to swap n/2 elements.
	  public static String reverseString(String word) {
			char[] words = word.toCharArray();
			int a = 0;
			int b = words.length -1; 
			while(a <= b) {
				char tmp = words[a];
				words[a++] = words[b];
				words[b--] = tmp;
			}
			
			return new String(words);
	  }
	
**can use string.toCharArray()
**can return the new string with new String(array)

another strategy: using test cases, generate a formula. then apply that formula. 
string is immutable, create a new array, modify that array then return string.
 result[formulUsed] = string.charAt(i);

for a seperate feature use a function. for instance, to check if prime make a function called ifPrime

double for loop: 
      j=0      j=1    j= 2    j=3
i=0
i=1
i=2
i=3
for(int I =0; I < 4; i++)
	if(i==0 || i==3) {for(int j 
           else for(int j 


Break the task for instance when drawing coordinage, not all needs to be in two for loops
first line is just ^ and the last line is +======>. break the task.

step by step:
get the grid
draw circle -->if x==0 |y==0 then if x!=0 || y!=0
draw y-axis --> if x==0 && y!=0
get the origin -->if x== 0 y== 0 
draw x-axis --> if y==0 &x!= 0
draw spaces --> else 
--->go step by step. 1when it's a big problem then 1,2,3,4,5-->there are steps. 

for(int y = yCoordinate; y > 0; y--);;;;see where it starts and the condition.
using two variables for loop: for(int i = 0, j=97; i<=25 && j<=122; i++ , j++) {

if(i >= keys.length) {
				i = 0;
			}
then I ++
====> smarter way would be just using %. 
int index = x % keyword.length();

From A4)
multi dimensional array ==> int[][] ==> {{1,23},{45,6},{77,21}}
for each loop: https://stackoverflow.com/questions/63759424/for-each-and-for-loop-same-functionality?noredirect=1#comment112748600_63759424
static/non-static:
https://stackoverflow.com/questions/62238423/if-youre-calling-a-method-on-an-array-should-that-method-be-static
remember to use the right type!!
grade = (point / solution.length) * 100; 
if point is int, it will give 0!!
whe it says initialize the random numGenerator with seed 123:
private static Random numberGenerator = new Random(123);

when it says initialize and copy the sheep references from the input array:
this.sheeps = new Sheep[sheeps.length];
		for(int i = 0; i < sheeps.length; i++) {
			this.sheeps[i] = sheeps[i];
		}
*look into array copy: deep copy vs shallow copy

