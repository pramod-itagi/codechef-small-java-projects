# Some of the points which I got to know while solving these problems:

Random:
Random is one of the special class under java.util package which can be used to generate random numbers.

Syntax:
We need to create an object of Random class to use this.

Random random = new Random();
random.nextInt(low, high);

Where low is including and high is excluding.

Example:

random.nextInt(1,101); -> Refers to random numbers between 1 to 100 (as 101 is excluded)
