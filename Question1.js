/**
 * Name: Nabilah Binti Mohd Sani
 * Question 1: Find the sum of the digits in the number 100!
 *
 */
// calculate and display the sum of natural numbers

// input value
const value_naturalnum = parseInt(prompt('Enter a positive number: '));

let sum_naturalnum = 0, i = 1;

// looping from i = 1 to value_naturalnum
while(i <= value_naturalnum) {
	sum_naturalnum += i;
    i++;
}

console.log('The sum of natural numbers:', sum_naturalnum);