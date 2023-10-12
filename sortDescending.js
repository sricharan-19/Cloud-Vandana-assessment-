function sortDescending(arr) {
    // Use the sort method with a custom comparison function
    arr.sort(function(a, b) {
        // Compare b and a to sort in descending order
        return b - a;
    });
}

// Example usage
const numbers = [5, 2, 8, 1, 4];
console.log("Original array:", numbers);

// Sort the array in descending order
sortDescending(numbers);

console.log("Sorted array in descending order:", numbers);