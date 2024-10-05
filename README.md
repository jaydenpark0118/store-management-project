# store-management-project
# Unit 2 - Store Management Project

## Introduction

You are opening a new business in your community! Businesses often need programs to manage the products and services they offer and track orders and requests from customers. Your goal is to create a store management system for your business.

## Requirements

Use your knowledge of object-oriented programming and class structure and design to create your store management system:
- **Create a class hierarchy** – Develop a superclass that represents a product or service your business offers and one or more subclasses that extend the superclass to represent more specific types of products or services.
- **Declare instance variables** – Declare instance variables in the superclass that are shared with the subclasses and instance variables in the subclasses that are not shared with the superclass.
- **Write constructors** – Write no-argument and parameterized constructors in the superclass and subclasses. Subclass constructors use the super keyword to call the superclass constructor.
- **Implement accessor and mutator methods** – Write accessor and mutator methods for instance variables that should be accessible and/or modifiable from outside of the class.
- **Implement a toString() method** – Write toString() methods in the superclass and subclasses that return information about the state of an object.

## UML Diagram

Put and image of your UML Diagram here. Upload the image of your UML Diagram to your repository, then use the Markdown syntax to insert your image here.

UML Diagram for my project!
![UML diagram](<Copy of UML Diagram.png>)

## Description

My project is a flower shop and it mainly sells roses, tulips, and birds of paradise. I chose this topic because flowers and ver diverse and I find them interesting. To make this project I used many accessor and mutator methods to reassign and get the values of the instance variables in the superclass from the subclasses. I am most proud of my calculatePrice method as it changes prices based on the type of flower, the amount, and other customization options. I was also able to use a toString method to print out the values that user could interact with, using the Scanner. The scanner allowed the user to pick their own options and customize their flowers. They can choose how many types of flowers they want, what kind of flowers, the color, the amount, if they would like to remove thorns, and the species of some flowers. My program just needs numbers to be imputed that corresponds to certain values. After each iteration of flower customization, the prorgam will output the information the user chose for that certain flower.