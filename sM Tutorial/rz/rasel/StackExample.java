package com.rz.rasel;

/*
{DELAY=200}
{ENTER}
//Data structure stack in "JAVA" array based implementation{ENTER}
//Stack Implementation class{ENTER}
pri{ENTER}cl{ENTER} StackImplementation{{}{ENTER}
pri{ENTER}in{ENTER} stackSize;{ENTER}
pri{ENTER}in{ENTER}{[}{END} stackContainer;{ENTER}
pri{ENTER}in{ENTER} top;{ENTER}
//Class constructor to create stack with size{ENTER}
pu{ENTER}SIm{ENTER}{(}in{ENTER} argStackSize{END} {{}{ENTER}
th{ENTER}.ss{ENTER} = ass{ENTER};{ENTER}
th{ENTER}.sc{ENTER} = new in{ENTER}ss{ENTER}{END};{ENTER}
th{ENTER}.t{ENTER} = -1;{DOWN}{ENTER}
{ENTER}
//This method returns true if the stack is empty{ENTER}
pu{ENTER}bo{DOWN}{ENTER} isEmpty{(}{END} {{}{ENTER}
re{ENTER}{(}to{ENTER} == -1{)};{DOWN}{ENTER}
{ENTER}
//This method returns true if the stack is full{ENTER}
pu{ENTER}bo{DOWN}{ENTER} isStackFull{(}{END} {{}{ENTER}
re{ENTER}{(}to{ENTER} == ss{ENTER} - 1{)};{DOWN}{ENTER}
{ENTER}
//This method adds new entry to the top of the stack{ENTER}
pu{ENTER}vo{DOWN}{ENTER}push{(}in{ENTER} argValue{)} th{ENTER}Ex{ENTER} {{}{ENTER}
if{(}th{ENTER}.iss{ENTER}{)} {{}{ENTER}
thro{ENTER}new Ex{ENTER}"Stack is already full. Can not add element."{)};{DOWN}{ENTER}
Sy{ENTER}.{ENTER}.{ENTER}{LEFT}{LEFT}argValue {+} " :push in stack{END}{ENTER}
{+}{+}to{ENTER};{ENTER}
th{ENTER}.sc{ENTER}{[}to{ENTER}{]} = ar{ENTER};{DOWN}{ENTER}
{ENTER}
//This method removes an entry from the top of the stack.{ENTER}
pu{ENTER}int pop{(}{)} th{ENTER}Ex{ENTER} {{}{ENTER}
if{(}th{ENTER}.ie{ENTER}{)} {{}{ENTER}
thro{ENTER}new Ex{ENTER}"Stack is empty. Can not remove element."{)};{DOWN}{ENTER}
int element = th{ENTER}.sc{ENTER}{[}to{ENTER}{]};{ENTER}
Sy{ENTER}.{ENTER}.{ENTER}{LEFT}{LEFT}element {+} " :pop from stack{END}{ENTER}
--to{ENTER};{ENTER}
re{ENTER}el{ENTER};{DOWN}{ENTER}
{ENTER}
//This method returns top of the stack without removing it.{ENTER}
pu{ENTER}int peek{(}{)} {{}{ENTER}
re{ENTER}sc{ENTER}{[}to{ENTER}{]};{DOWN}{DOWN}{ENTER}
pu{ENTER}st{ENTER}vo{ENTER}main{(}Str{ENTER}{[}{]} args{)} {{}{ENTER}
SExa{ENTER} s{ENTER} = new SExa{ENTER};{ENTER}
SI{ENTER} stack = s{ENTER}.n{ENTER} SI{ENTER}5{)};{ENTER}
tr{ENTER}{BACKSPACE}
{DOWN} ca{ENTER}Ex{ENTER} ex{)} {{}{ENTER}
Sy{ENTER}.{ENTER}.{ENTER}{LEFT}{LEFT}ex.gm{ENTER}{END}
{UP}{UP}{ENTER}
s.pu{ENTER}4{END}{ENTER}
s.pu{ENTER}8{END}{ENTER}
s.pu{ENTER}3{END}{ENTER}
s.pu{ENTER}89{END}{ENTER}
s.po{ENTER};{ENTER}
s.pu{ENTER}34{END}{ENTER}
s.pu{ENTER}45{END}{ENTER}
s.pu{ENTER}78{END}{ENTER}
{DOWN}{DOWN}{DOWN}{ENTER}
tr{ENTER}{BACKSPACE}
{DOWN} ca{ENTER}Ex{ENTER} ex{)} {{}{ENTER}
Sy{ENTER}.{ENTER}.{ENTER}{LEFT}{LEFT}ex.gm{ENTER}{END}
{UP}{UP}{ENTER}
s.po{ENTER};{ENTER}
s.po{ENTER};{ENTER}
s.po{ENTER};{ENTER}
s.po{ENTER};{ENTER}
s.po{ENTER};{ENTER}
s.po{ENTER};{DOWN}{DOWN}{DOWN}{ENTER}
Sy{ENTER}.{ENTER}.{ENTER}{LEFT}{LEFT}"\n\nPlease Subscribe And Like This Channel.{END}{ENTER}
Sy{ENTER}.{ENTER}.{ENTER}{LEFT}{LEFT}"Also Leave A Comment{END}{ENTER}
//A BADGE MATE Tutorial
*/
public class StackExample {

    private class StackImplementation {
        private int stackSize;
        private int[] stackContainer;
        private int top;

        public StackImplementation(int argStackSize) {
            this.stackSize = argStackSize;
            this.stackContainer = new int[stackSize];
            this.top = -1;
        }

        //This method returns true if the stack is empty
        public boolean isEmpty() {
            return (top == -1);
        }

        //This method returns true if the stack is full
        public boolean isStackFull() {
            return (top == stackSize - 1);
        }

        public void push(int argValue) throws Exception {
            if (this.isStackFull()) {
                throw new Exception("Stack is already full. Can not add element.");
            }
            System.out.println(argValue + " :push in stack");
            this.stackContainer[++top] = argValue;
        }

        //This method removes an entry from the top of the stack.
        public int pop() throws Exception {
            if (this.isEmpty()) {
                throw new Exception("Stack is empty. Can not remove element.");
            }
            int element = this.stackContainer[--top];
            System.out.println(element + " :pop from stack");
            return element;
        }

        //This method returns top of the stack without removing it.
        public int peek() {
            return stackContainer[top];
        }
    }

    public static void main(String[] args) {
        StackExample stackExample = new StackExample();
        StackImplementation stack = stackExample.new StackImplementation(5);
        try {
            stack.push(4);
            stack.push(8);
            stack.push(3);
            stack.push(89);
            stack.pop();
            stack.push(34);
            stack.push(45);
            stack.push(78);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        try {
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
/*
Java Dynamic Stack Implementation
http://www.java2novice.com/data-structures-in-java/stacks/dynamic-stack/
DONE
TimesCharacterCounter
Count Total Number of Times Each Character Appears in a String - Java
*/
