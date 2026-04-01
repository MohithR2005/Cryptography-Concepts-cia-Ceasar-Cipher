THEORY:Ceasar Cipher

It is a substitution cipher where each letter in the plaintext is shifted by a fixed number of positions in the alphabet.

The number of positions is called the key (shift).
For example, with a shift of 3:
A → D
B → E
C → F

How It Works
Choose a shift value (key).
Replace each letter in the message with a letter that is key positions ahead.
If the shift goes past 'Z', it wraps around to 'A'.

Example:

Plaintext: HELLO
Key: 3
Ciphertext: KHOOR

Instructions to run the code:
Run this in the terminal of the code editor - python filename.py

Worked Example 1 :
Given:

Plaintext = HELLO
Key (shift) = 3

Step-by-step encryption:

Letter	Position	+3 Shift	Cipher
H	       7	        10	      K
E	       4	         7	      H
L	       11	        14	      O
L	       11	        14	      O
O	       14	        17	      R

Ciphertext = KHOOR

Worked Example 2:
Given:

Plaintext = XYZ
Key (shift) = 4

Step-by-step encryption:

Letter	Position	+4 Shift	Result
X	      23	      27 → 1	B
Y	      24	      28 → 2	C
Z	      25	      29 → 3	D

(After Z, it wraps back to A using mod 26)

Ciphertext = BCD

__________________________________________________________________________________________________________

Prompts used:
give me the java code for ceaser cipher where it takes plaintext as input from user and key from user,includes a hash function, and outputs the cipher text, similarly for decryption, takes cipher text, does hash fucntion and outputs plain text, i want encryptipn and decryption to be asked from user like a switch case or if else loop, inlcude all functions inside the code


Algorithm for Caesar Cipher

Start
Input the plaintext string (P)

Generate key value based on input string using Hash function (K)

Hash Function Algorithm
3.1 Input key
3.2 Calculate ASCII sum
3.3 Hash = ASCII sum % 26

Hash function converts a string into numerical key

Initialize empty string (Cipher text) (C)

For each character ch in P :

5.1 If ch is uppercase :
    5.1.1 C = (ch - 'A' + K) mod 26 + 'A'

5.2 If ch is lowercase :
    5.2.1 C = (ch - 'a' + K) mod 26 + 'a'

5.3 Else :
    5.3.1 Keep character unchanged

Append result to C
Print / Return C
Stop
