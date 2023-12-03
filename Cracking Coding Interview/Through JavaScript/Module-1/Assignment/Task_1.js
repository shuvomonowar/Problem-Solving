// Finding factorial of a given number

function Solution() {
    let input_number = parseInt(prompt("Enter input number : "));
    let result = 1;

    while (input_number > 1) {
        result *= input_number;
    }

    console.log("The result of factorial is " + result);
}

Solution();