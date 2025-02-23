# arrayCount.asm
  .data 
arrayA: .word 11, 0, 31, 22, 9, 17, 6, 9   # arrayA has 8 values
count:  .word 999                      # dummy value

  .text
main:
    # code to setup the variable mappings
    la   $t0, arrayA  # map base address of arrayA to $t0
    lw   $t8, count   # map value of count to $t8
    add  $t8, $zero, $zero # initialize count to 0

    # code for reading in the user value X
    li   $v0, 5           # read user input
    syscall
    add  $t1, $v0, $zero # store user input @ $t1
    
    addi $t5, $t1, -1   # generate mask from user's input 

    # code for counting multiples of X in arrayA
    addi $t2, $t0, 32       # $t2 stores the address of last element in arrayA
loop: 
    bge  $t0, $t2, print   # compares pointer position
    lw   $t3 0($t0)         # load word at pointer
    and  $t4, $t3, $t5    # masks to find modulo
    bne  $t4, $zero, skip  # skip if not a multiple
    addi $t8, $t8, 1      # count++ if it's a multiple

skip: 
    addi $t0, $t0, 4      # move pointer to next element
    j    loop                # loop back
  
    # code for printing result
print: 
    li   $v0, 1            # system call code for print_int
    add  $a0, $t8, $zero  # map count value to $a0
    syscall              # print out count value

    # code for terminating program
    li   $v0, 10             
    syscall
