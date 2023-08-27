import time

# Define a simple processing function
def process_object(obj):
    return obj * 2

# Create an array with 10,000 objects
array_size = 1000000
input_array = [i for i in range(array_size)]

# Measure the time taken to process each object in the array
start_time = time.time()

for obj in input_array:
    processed_obj = process_object(obj)
    
end_time = time.time()

# Calculate and print the elapsed time
elapsed_time_ms = (end_time - start_time) * 1000
print(f"Time taken to process {array_size} objects: {elapsed_time_ms:.6f} milliseconds")

input("Press enter to exit;")