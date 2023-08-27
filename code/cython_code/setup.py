from setuptools import setup
from Cython.Build import cythonize
import numpy

setup(
    ext_modules=cythonize("process_objects.pyx"),
    include_dirs=[numpy.get_include()],
    compiler_directives={'language_level': "3"},
    extra_compile_args=['/EHsc']
)