function fizzBuzz(n) {
    for(let i = 1; i <= n; i++) {
        if (i % 3 === 0 && i % 5 === 0) console.log('Fizzbuzz');
        else if (i % 3 === 0 && i % 5 !== 0) console.log('Fizz');
        else if (i % 5 === 0 && i % 3 !== 0) console.log('Buzz');
        else if (i % 3 !== 0 && i % 5 !== 0) console.log(i);
    }
}
fizzBuzz(100);