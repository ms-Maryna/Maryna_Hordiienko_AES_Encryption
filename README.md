# AES Encrypt/Decrypt Java Application

This project is a console-based Java application that encrypts and decrypts text files using the AES encryption algorithm.  
It includes a menu system that allows the user to encrypt a file, decrypt a file using a valid key, and handle invalid input gracefully.

## Features
- AES encryption with randomly generated key
- AES decryption using user-provided key
- Console menu interface
- Input validation and exception handling
- Output files:
    - ciphertext.txt
    - plaintext.txt

## Project Structure
- Main.java – handles menu and user interaction
- AESUtil.java – AES encryption and decryption logic
- FileUtil.java – file reading/writing
- MenuUtil.java – reusable menu methods

## How to Run
Run the Main class from IntelliJ.  
You will be prompted to enter the filename and (for decryption) the key.

## Status
Project in progress is core structure created, AES implementation in development.