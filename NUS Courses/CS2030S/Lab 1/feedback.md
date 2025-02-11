# Exercise 1
## Feedback for bibicoding
### Your Code
The review is done based on [your code eubmitted here](https://www.github.com/nus-cs2030s-2425-s2/ex1-bibicoding/tree/6bbdb639829d61833a10c8db95145ae66345fc9e).

Detailed comments, if any, from the reviewer can be found [here](https://www.github.com/nus-cs2030s-2425-s2/ex1-bibicoding/commit/6bbdb639829d61833a10c8db95145ae66345fc9e).  Please consider them carefully and improve your code if applicable.
Note that if you make additional submissions after the deadline, the two set of code above might be different.

### Feedback from Bot
Your submitted code has violated some OO principles.

* Encapsulation: The program properly encapsulates bank, counter, and customer in classes.. failed



### Output from Static Code Analyzer (PMD)

In addition, our static code analyzer uncovers the following issues (may repeat what our bot discovered):
```
./BankSimulation.java:13:	UnusedPrivateField:	Avoid unused private fields such as 'available'.
./Counter.java:24:	BooleanGetMethodName:	A getX() method which returns a boolean should be named isX()
./DepartureEvent.java:10:	UnusedPrivateField:	Avoid unused private fields such as 'endTime'.
```

### Achievement Badge

Good (Has Design Flaws, Warnings, and/or Style Errors)