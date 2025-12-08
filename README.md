# Student: Maryna Hordiienko
# Module: Computer Security SD2a 

# AES Encrypt/Decrypt Java Application

This project is a Java application that demonstrates secure AES encryption and decryption of text files.
The user can encrypt any .txt file, generate a random AES key, and decrypt the encrypted file using that key.

The goal of this CA was to design a professional, user-friendly terminal application that includes a menu system, AES processing, exception handling, and safe input validation.

## Features
Menu system :Encrypt, Decrypt, Exit
AES-128 encryption
Random key generation
Base64 key display for the user
File writing:
-ciphertext.txt(encrypted output)
-plaintext.txt (decrypted output)
User-friendly prompts
Exception handling for invalid input and missing files
Validation for menu choices and filenames

## Project Structure
- Main.java. - Handles the main menu, user interaction, and the overall program flow.
Controls encryption and decryption requests from the user.
- AESUtil.java. - Contains the core AES encryption and decryption logic.
Encrypts plaintext files, decrypts ciphertext, and writes output files.
- AESKey.java. - Simple class that stores the AES key as a byte array and provides access to it.

- KeyUtil.java - Generates a secure random AES-128 key using Java’s KeyGenerator.
Used during the encryption process.

- FileUtil.java - Responsible for reading text from files and writing text to files.
Handles plaintext, ciphertext, and decrypted output.

- InputValidator.java - Validates user inputs, including menu options and filenames.
Ensures the program does not crash on invalid input.

- MenuUtil.java - Provides a reusable method for printing a clean, professional menu interface.

# Generated Files
ciphertext.txt - Created automatically after encryption.
Stores the encrypted Base64 text.
plaintext.txt  - Created automatically after decryption.
Stores the decrypted original text.
# README.md
Documentation explaining how the program works, project purpose, testing, and reflections.



# How to use
### Encrypt a File
Select 1 from the menu.
Enter the filename #CA2# (without .txt).
The program:
reads the file
generates a random AES key
encrypts the file
saves encrypted data to ciphertext.txt
The AES key (Base64) is printed on screen.
You must save this key for decryption.

### Decrypt a File
Select 2 from the menu.
Enter the filename (e.g., ciphertext).
Enter the AES key (Base64).
The program:
decrypts the data
prints the decrypted text on screen
saves the output to plaintext.txt 

# Testing summary 
### Test 1 – Encrypt valid file
Input:
1 = Encrypt
Filename: CA2
Expected: file read
encrypted data saved
AES key displayed
Result: Passed

### Test 2 – Decrypt using correct key
Input:
2 = Decrypt
Filename: ciphertext
AES Key: (key from previous test)
Expected:plaintext displayed on screen
plaintext.txt created
no errors
Result: Passed

### Test 3 – Invalid filename
Input:
Filename: aaa
Expected:
exception message
no crash
Result: Passed

### Test 4 – Wrong AES key
Input:
Random key
Expected:
decryption error message
no crash
Result: Passed 

# Exception handling and validation

The project includes:input validation, invalid menu number, invalid filenames,empty input, missing files

### Exception handling
Missing file. user sees: Encryption error: File not found
Wrong AES key. user sees: Decryption error: ...
Unexpected exceptions are handled gracefully, avoiding program crashes



# Reflection
During this CA, I improved my understanding of AES encryption, Base64 encoding, and secure key handling.
I learned how to separate logic into multiple classes, which made the project easier to manage and more professional.

I also practised exception handling and user input validation. 
This helped me make the program stable and safe, so it never crashes when the user enters incorrect data.

The biggest challenge was understanding the AES process and testing encryption/decryption. 
By running many tests and checking the output files, I was able to confirm that my program works correctly.
Overall, this project improved my confidence in Java, security concepts, and clean code design.