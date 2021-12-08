# Adding-to-Pi

Programmed November 2021 by Ezinna Ononuju

This is a program which I worked on with a Math-Major friend. He discussed a concept where if you add increasingly small positive and negative fractions infinitely, their sum approaches Pi. He described it as an infinite series of "the alternating sum of the odd reciprocals".

Since loops allow you to have a program with infinitely repeating behavior, I felt this would be interesting to put into code and observe the concept's behavior. With his help, we created a program which loops the infinite series until it reaches several digits of Pi. I found it really interesting!

One fascinating observation/behavior of this phenomenon is how the value of valueNearPi jumps slightly above Pi and slightly below Pi repeatedly. The series "zeroes in" on more and more digits of Pi as it is added and subtracted by increasingly smaller fractions.

Fun fact: A quantum computer wouldn't be able to reach new digits of Pi any faster than a normal computer (at least using this method) because in order to calculate the next digit of Pi, you need to know the previous digits computed so far. The kinds of repeating tasks that Quantum Computers are faster at are generally ones in which they can try multiple solutions at the same time, and each successive solution doesn't depend on a preceding one.
