My Historical Figures App

# 1 Purpose

My historical figures app is intended to show different historical
figures and what they where well know for. The app was created to help
little children understand and gain more knowledge about historical
figures.

# 2 Design Consideration

<img src="media/image1.png" style="width:3.93805in;height:6.90721in" />

## Intuitive Design

The application is easy to understand and user friendly. Its pretty
simple to navigate your way around the application and it accommodates
different age groups.

## Content Prioritization

The application consists of all necessary interface elements. The user
can understand what is expected from him/her for the app to get up and
running form the first glimpse.

## Legible Text Content

The history app uses simple design principles which make the using of
the app easy and fun. The font used is clear and big enough to see. The
heading of the app is in bold and italics to give it a fun and greeting
first appearance. The buttons are in clear white

# 3 Github and Github Actions

1\. Create a New GitHub Repository:

Go to the GitHub website (https://github.com/) and sign in to your
account.

Click on the "+" icon in the top right corner and select "New
repository".

Give your repository a name (st10453453 itumeleng), add a description
(My Historical Figures App IMAD5112 Assignment 1) and choose public.

Click on the "Create repository" button.

2\. Initialise the Repository with a README File:

After creating the repository, you'll see an option to "Initialize this
repository with a README". Check this option to create a README file.

Click on the "Create repository" button to finalize the creation of the
repository.

3\. Commit and Push Your Project Files to the GitHub Repository:

In Android Studio, go to VCS (Version Control System) -> Import into
Version Control -> Share Project on GitHub.

Log in to your GitHub account if prompted, and select the repository you
created earlier.

Click on the "Share" button to push your project files to the GitHub
repository.

4\. Regularly Commit and Push Your Code as You Make Progress:

After the initial push, continue making changes to your project in
Android Studio.

Whenever you make significant progress or changes, commit your changes
locally in Android Studio using VCS -> Commit Changes.

Once committed, push your changes to the GitHub repository using VCS ->
Git -> Push.

Testing and Automated Testing:

1\. Conduct Manual Testing:

Manually test your app to ensure it functions seamlessly and offers an
enjoyable educational experience for learners.

To test various features and user interactions do the following:

1\. Create a New Test Class:

In your Android project, navigate to the tests directory (or create it
if it doesn't exist).

Create a new Kotlin file for your test class. Name it appropriately to
indicate what component or functionality you are testing.

2\. Write Test Methods:

Inside the test class, write test methods like the example below.

3\. Use assertions to verify the expected behaviour of your code.

4\. Run the Tests:

Run the tests using the testing framework's tools provided by Android
Studio or through the command line.

Sample of a test class using JUnit

import org.junit.Assert.\*

import org.junit.Test

class MyUnitTest {

@Test

fun testWhenStatement() {

val result = when (95) {

95 -> " Nelson Mandela, Nelson Rolihlahla Mandela was a South African
anti-apartheid activist and politician who served as the first president
of South Africa from 1994 to 1999, died at age 95"

30 -> " Steve Biko Body, As a medical student, he founded a black
student organisation in 1969 and created a national 'black
consciousness' movement, died at age 30"

90 -> " Desmond Tutu, Desmond Tutu was a South African Anglican bishop
and theologian, known for his work as an anti-apartheid and human rights
activist, died at age 90"

else -> "Nobody famous known to me died at this age"

}

assertEquals(" Nelson Mandela, Nelson Rolihlahla Mandela was a South
African anti-apartheid activist and politician who served as the first
president of South Africa from 1994 to 1999, died at age 95", result)

}

}

2\. GitHub Actions for Automated Testing:

Set up GitHub Actions to automatically run tests and build your code
whenever changes are pushed to the repository.

Create a GitHub Actions workflow (.github/workflows/tests.yml) to run
tests automatically on every push:

Create a .github/workflows directory in your project repository.

Inside this directory, create YAML files defining your GitHub Actions
workflows for testing and building.

Sample GitHub Actions Workflow for Testing (tests.yml):

name: Run Tests

on: \[push\]

jobs:

test:

runs-on: ubuntu-latest

steps:

\- name: Set up JDK

uses: actions/setup-java@v2

with:

distribution: 'adopt'

java-version: '11'

\- name: Check out code

uses: actions/checkout@v2

\- name: Build and test

run: ./gradlew test

Set Up Automated Build:

Create a GitHub Actions workflow (.github/workflows/build.yml) to build
the APK automatically on every push.

Sample GitHub Actions Workflow for Building (build.yml):

name: Build APK

on: \[push\]

jobs:

build:

runs-on: ubuntu-latest

steps:

\- name: Set up JDK

uses: actions/setup-java@v2

with:

distribution: 'adopt'

java-version: '11'

\- name: Check out code

uses: actions/checkout@v2

\- name: Build APK

run: ./gradlew assembleDebug

Test your workflows by pushing changes to your repository and observing
the actions running in the "Actions" tab on GitHub.

# 4 link to YouTube video

<https://youtu.be/Ba6W-CJiya0>

# 5 Referencing

Mandela, N., 2008. *Long walk to freedom: The autobiography of Nelson
Mandela*. Hachette UK.

Tutu, D., 2007. *Believe: The words and inspiration of Desmond Tutu*.
Blue Mountain Arts, Inc..
