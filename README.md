Random generation service sequences

• The task is to generate 5 sequences of prime numbers from 10 to 100 numbers long
in an array, the length is set from the WEB interface.
• Using Spring Boot MVC to create server pages:
• The HTML page must specify the length of an array of primes. Array generated
one-time and does not change until the next request to generate an array from the WEB UI.
• An algorithm for generating random sequences is launched from the HTML page,
where there are 2 options of work "AUTO" and "GENERATE", by pressing the button
"GENERATE" gives 5 sequences of numbers of 6 random numbers from
each array. The sequence of numbers must exclude duplicates. By clicking on
button "AUTO" the sequence is generated every 10 seconds and transmitted to the UI.
The sequence of numbers is displayed in the table.

1.Name of project: generatePrimeNumbersSequences

2.Port of the project: http://localhost:8080

3.Start page: http://localhost:8080

4.Templates: webapp/WEB-INF/jsp

5.css: webapp/css/main.css

