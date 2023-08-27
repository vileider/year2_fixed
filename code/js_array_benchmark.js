// Define a simple processing function
function processObject(obj) {
    return obj * 2;
}

// Create an array with 10,000 objects
const arraySize = 1000000;
const inputArray = Array.from({ length: arraySize }, (_, i) => i);

// Measure the time taken to process each object in the array
const startTime = new Date();

for (const obj of inputArray) {
    const processedObj = processObject(obj);
}

const endTime = new Date();

// Calculate and log the elapsed time
const elapsedMilliseconds = endTime - startTime;
console.log(`Time taken to process ${arraySize} objects: ${elapsedMilliseconds} milliseconds`);
