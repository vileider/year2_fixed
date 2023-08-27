import numpy as np
import time
import process_objects

# Create an array with 1,000,000 objects
array_size = 1000000
input_array = np.arange(array_size, dtype=np.int32)

# Warm up the cache
result_array = process_objects.process_objects(input_array)

# Measure the time taken to process the array
start_time = time.time()
result_array = process_objects.process_objects(input_array)
end_time = time.time()

elapsed_time_ms = (end_time - start_time) * 1000
print(f"Time taken to process {array_size} objects: {elapsed_time_ms:.6f} milliseconds")
input("Press enter to exit;")