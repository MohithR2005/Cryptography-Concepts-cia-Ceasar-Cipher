Prompts used:
give me the java code for ceaser cipher where it takes plaintext as input from user and key from user,includes a hash function, and outputs the cipher text, similarly for decryption, takes cipher text, does hash fucntion and outputs plain text, i want encryptipn and decryption to be asked from user like a switch case or if else loop, inlcude all functions inside the code


Algorithm for Caesar Cipher

Start
Input the plaintext string (P)

Generate key value based on input string using Hash function (K)

# Hash Function Algorithm
3.1 Input key
3.2 Calculate ASCII sum
3.3 Hash = ASCII sum % 26

# Hash function converts a string into numerical key

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
