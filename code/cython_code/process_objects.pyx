cimport cython
cimport numpy as np

@cython.boundscheck(False)
@cython.wraparound(False)
def process_objects(np.ndarray[int, ndim=1] arr):
    cdef int i
    cdef int n = arr.shape[0]
    cdef np.ndarray[int, ndim=1] result = arr.copy()

    for i in range(n):
        result[i] = arr[i] * 2

    return result
