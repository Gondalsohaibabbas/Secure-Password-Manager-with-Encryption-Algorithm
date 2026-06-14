# Secure Password Manager with Encryption Algorithm

## Overview

Secure Password Manager is a Java-based console application developed using Data Structures and Algorithms concepts. The system allows users to securely store, search, update, delete, and display website credentials. Passwords are stored in encrypted form and decrypted only when displayed to the user.

The project demonstrates the practical use of Hashing, Hash Tables, Binary Search Trees (BST), Linked Lists, and basic Encryption techniques.

## Features

* Master Password Authentication
* Add New Website Credentials
* Search Stored Credentials
* Update Existing Passwords
* Delete Saved Accounts
* Display All Accounts in Sorted Order
* Password Encryption and Decryption
* Hash-Based Storage for Fast Lookup
* BST-Based Sorted Display

## Data Structures Used

### Hash Table

A custom hash table is used to store account records efficiently. Website names are converted into hash indexes using a custom hash function.

### Linked List (Separate Chaining)

Collision handling is implemented using linked lists. Multiple accounts that map to the same hash index are stored as a chain.

### Binary Search Tree (BST)

All stored records can be transferred into a BST and displayed using inorder traversal, producing an alphabetical listing of website names.

## Project Structure

### AccountNode

Stores:

* Website Name
* Username
* Password
* Reference to Next Node

### Hash

Handles:

* Insert
* Search
* Update
* Delete
* Sorted Display

### BST

Handles:

* BST Insertion
* Inorder Traversal

### AuthSecure

Handles:

* Password Encryption
* Password Decryption
* Master Password Verification

### Main

Provides the menu-driven user interface.

## Encryption Method

Passwords are encrypted using a simple character-shift algorithm.

Encryption:

* Each character is shifted by +10

Decryption:

* Each character is shifted by -10

This implementation is intended for educational purposes and should not be considered production-level security.

## Authentication

The application requires a master password before access is granted.

### Default Master Password

```text
sohaib@1234
```

The master password is currently hardcoded in the source code for demonstration and testing purposes.

## Menu Options

```text
1. Add Password
2. Search Password
3. Delete Password
4. Update Password
5. Display All Passwords
6. Exit
```

## Example Workflow

1. Login using the master password.
2. Add website credentials.
3. Search credentials by website name.
4. Update passwords when needed.
5. Delete obsolete accounts.
6. Display all records in sorted order using BST traversal.

## Learning Objectives

This project demonstrates:

* Hashing Techniques
* Collision Handling
* Linked List Implementation
* Binary Search Tree Implementation
* Recursion in BST Traversal
* Data Security Concepts
* Object-Oriented Programming in Java

## Technologies Used

* Java
* Object-Oriented Programming
* Data Structures and Algorithms

## Author

Sohaib Abbas
