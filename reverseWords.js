function reverseWords(sentence) {
    // Split the sentence into an array of words
    const words = sentence.split(' ');

    // Reverse each word in the array
    const reversedWords = words.map(word => reverseString(word));

    // Join the reversed words back into a sentence
    const reversedSentence = reversedWords.join(' ');

    return reversedSentence;
}

function reverseString(str) {
    // Convert the string to an array of characters, reverse it, and join it back into a string
    return str.split('').reverse().join('');
}

// Example usage
const inputSentence = "I'm in bengaluru";
const result = reverseWords(inputSentence);

console.log("Original sentence:", inputSentence);
console.log("Reversed words:", result);