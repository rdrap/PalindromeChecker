package palindromechecker;

public class PalindromeChecker {

    public static void main(String[] args) {
        RabinKarp rk = new RabinKarp();
        rk.search();
    }
}

/*
SAMPLE OUTPUT #1:
Click 'enter' and input a character to add on each character; enter 'DONE' to stop the program

a
a is a palindrome

b
ab is not a palindrome

a
aba is a palindrome
DONE

---------------------------------------------------------

SAMPLE OUTPUT #2:
Click 'enter' and input a character to add on each character; enter 'DONE' to stop the program

r
r is a palindrome

a
ra is not a palindrome

c
rac is not a palindrome

e
race is not a palindrome

c
racec is not a palindrome

a
raceca is not a palindrome

r
racecar is a palindrome
DONE
*/