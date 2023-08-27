[LO2.6.2.3]
### Data as a service

In my learning journey, I got interested in how different computer languages can work together to make things faster. I focused on two languages, Python and JavaScript. I wanted to see if they could work together to make handling data faster.

I started by looking at a guide that would say: combining Python and JavaScript is a smart idea. Vercel.com says says that Python and JavaScript are two of the most popular programming languages in the world, and each has its own strengths and weaknesses. By using both languages in the same app, I can leverage the strengths of both languages. JavaScript is a dynamic language and by running in the browser I can reduce the load on the server. Python is known as language for dtata analyzis.(Vercel, 2023)

I talked to one of my Teacher, Karen, and did some research. I learned that Python might not be the best choice for what I wanted to do. I looked at C++, Python, and JavaScript and saw that JavaScript was the winner.(Todorow, 2023) But I still wanted to see if I could mix languages to make working with data even faster.

I found a website that talked about a way to make Python really fast. It used something called "cython calling c." This mix of Python and C was really interesting.Alex compares the performance of numpy, a popular Python library for numerical computing, with other alternatives such as numexpr, cython, theano, tensorflow, and julia. Cython is a good option for writing low-level code that can interact with numpy arrays.(Rogozhnikov, 2023) Since I wanted create alghoritm that process objects in array that was what I needed. I watched a video to learn more. I learned that Cython can significantly speed up Python code by converting it into native C or C++ code, which can run faster and more efficiently than interpreted Python code. (NeuralNine, 2021) I struggled a bit and needed to install some things, but I finally made it work. This new way was about 7 times faster than using just JavaScript and 60 times faster that using just vanilla python. (2. Todorow, 2023) I thought this could be used in real projects.

I read more about this and learned that This article says that Cython makes Python code talk to C. It's kind of like using the speed of C with the comfort of Python. Cython writes C extensions for Python as easy as Python itself. It also highlights some of the key changes and features in Cython 3.0((InfoWorld), 2023)[LO2.6.2.3]Article at common industry media says that Cython can significantly improve the performance of Python code by converting it into native C or C++ code, which can run faster and more efficiently than interpreted Python code. (Sampad, 2023) This mix can make math and data things faster too. There's a library called NumPy that helps with this. It's like a helper to do math better and faster. The new Cython can use NumPy without needing to change everything.(Wayner et al., 2023) I thought about using this in real projects.

I also looked at using Python with JavaScript in a web framework called Flask. It helps Python work with other things like Next.js.(pythonbasics, 2023) But I had some trouble making it work right away. It had errors. I thought maybe if I make separate parts for Python and Next.js, it could work. But that might not be the best way because Next.js has good built-in tools.

There was a bit of a puzzle to solve with using Python's. I learned how to make it work by change running script from ```python3``` to ```python```. This helped me run flask within next.js. With Next.js at frontend and and python at backend.(3. Todorow, 2023)

In the end, I conducted research, showed that mixing languages can make things faster and I think improrvig app speed is a business related topic.[LO2.6.2.3] I learned about new tools like Cython and flask, can make things speedy.I will keep researching that topic I looking forward to create fully funcitonal API. My goal is to create aplatform for advanced calculations at the server side.

Vercel (2023) How can I use python and JavaScript in the same application?, Vercel Documentation. Available at: https://vercel.com/guides/how-to-use-python-and-javascript-in-the-same-application (Accessed: 27 August 2023). 

1. Todorow, B. (2023) C++, python and JavaScript comparison, bitbucket repo. Available at: https://bitbucket.org/vileider/year2_fixed/src/master/images/cplus_py_js_comparison.png (Accessed: 2023). 

Rogozhnikov, A. (2023) benchmarks of speed numpy vs all, Benchmarks of speed (numpy vs all). Available at: https://arogozhnikov.github.io/2015/01/06/benchmarks-of-speed-numpy-vs-all.html (Accessed: 27 August 2023). 

Rogozhnikov, A. (2023) benchmarks of speed numpy vs all, Benchmarks of speed (numpy vs all). Available at: https://arogozhnikov.github.io/2015/01/06/benchmarks-of-speed-numpy-vs-all.html (Accessed: 27 August 2023). 

2. Todorow, B. (2023b) cython vs python-benchmark, bitbucket repo. Available at: https://bitbucket.org/vileider/year2_fixed/src/master/images/cython_python_benchmark.png (Accessed: 2023). 

(InfoWorld), S.Y. (2023) Cython 3.0: The next generation of python at the speed of C, Reseller News. Available at: https://www.reseller.co.nz/article/708053/cython-3-0-next-generation-python-speed-c/ (Accessed: 27 August 2023). 

Wayner, P. et al. (2023) Technology insight for the Enterprise, InfoWorld. Available at: https://www.infoworld.com/video/106339/numpy-the-python-library-for-faster-math-and-data-science-apps) (Accessed: 27 August 2023). 

pythonbasics (2023) What is Flask Python, What is Flask Python - Python Tutorial. Available at: https://pythonbasics.org/what-is-flask-python/ (Accessed: 27 August 2023). 

3. Todorow, B. (2023a) benchmark sent from server. Available at: https://bitbucket.org/vileider/year2_fixed/src/master/images/uploaded_benchmark_from_server_cython.png (Accessed: 2023). 

Sampad, B. (2023) Improving python code performance with Cython - LinkedIn. Available at: https://www.linkedin.com/pulse/improving-python-code-performance-cython-biswas-sampad (Accessed: 27 August 2023). 