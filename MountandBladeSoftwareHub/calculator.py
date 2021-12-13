#Mount & Blade calculator vers 1.0
#t=while loop variable
#a=first number
#b=second number
#c=operation
#z=result
#k=restarting variable
#l=software loop
def lines():
    print("----------------------------------------------------------------------------------------------------------------------")

def space():
    print()

space()
space()
lines()
print("Mount & Blade calculator vers 1.0")
lines()
space()
l=1
while l==1:
        
    #starting software loop
    #starting while loop
    #asking for first number
    print("Insert first number:")

    t=1
    while t==1:
        a=input()
        try:
            float(a)
            t=0
        except:
            print("Use numbers.")
    space()
    #startung second while loop
    #asking for second number
    print("Insert second number:")
    t=1
    while t==1:
        b=input()
        try:
            float(b)
            t=0
        except:
            print("Use numbers.")

    #starting third while loop
    #asking for operation
    #calculating input  
    print("Choose an operation:")
    t=1
    while t==1:
        c=input()
        if c=="+":
            space()
            lines()
            z=float(a)+float(b)
            print(a, "+", b, "=", z)
            print("Rounded:", round(z))
            t=0
        elif c=="-":
            space()
            lines()
            z=float(a)-float(b)
            print(a, "-", b, "=", z)
            print("Rounded:", round(z))
            t=0
        elif c=="*":
            space()
            lines()
            z=float(a)*float(b)
            print(a, "*", b, "=", z)
            print("Rounded:", round(z))
            t=0
        elif c=="/":
            space()
            lines()
            z=float(a)/float(b)
            print(a, "/", b, "=", z)
            print("Rounded:", round(z))
            t=0
        else:
            print("Use +, -, *, / only.")
    lines()
    space()
    #asking to restart
    print("Do you want to calculate an other calculation? y/n")   
    #testing input
    #starting fourth while loop
    t=1
    while t==1:
        k=input()
        if k=="y":
            space()
            lines()
            print("Restarting...")
            lines()
            space()
            l=1
            t=0
        elif k=="n":
            space()
            lines()
            print("Going back to Hub...")
            lines()
            space()
            l=0
            t=0
        else:
            print("use 'y' or 'n'.")
            t=1