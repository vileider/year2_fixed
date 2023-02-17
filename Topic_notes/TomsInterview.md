embedded system - mostly written in c/c++
It is about programming microcontrollers.


CPU - calculate billions of calculations per second.
Every CPU runs code based on specific machine language.
- saves information in registers.
- commands are written in command book.
- uses pipelines to optimize the processing commands.

the clock job is to tell CPU to do something.

Interrupts:
Because computer is technically only run one program at
a time, the ability for applications to interrupt each other gives the illusion of multitasking. In reality, they are time sharing, using scheduled interruptions.
Interrupt handler prioritise the interruptions and places them into a queue to be handled.

Fetch-decode-execute cycle:
With every tick of the clock CPU goes through step what is called 
fetch execute cycle.
Each clock tick the CPU will:
- fetch an instruction from a memory address
- decode it and execute it.

DMA direct memory access.
synapsis
chip design, verification, IP integration, and software security and quality testing. We help our customers innovate from silicon to software so they can bring amazing new products to life.

tom ask (take a look at C++, embedded, linux, how a cpu works – words such as interrupts, fetch-decode-execute, dma