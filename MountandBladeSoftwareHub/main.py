#main m&b software Vers 0.1
#a=software choice
#t=1 while loop variable
#k=y/n variable
#functions
def lines():
    print("----------------------------------------------------------------------------------------------------------------------")
def space():
    print()
        
lines()
print("Mount & Blade: Warband Software Hub Vers. 0.1")
lines()
space()
lines()
print("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@")
print("@ Welcome back, Lord Eaglestone. @")
print("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@")
lines()
space()
space()
#starting while loop
end=1
while end==1:
    
    print("Choose one of the following programs:")
    lines()
    space()
    print("-Trade software Vers. 1.5")
    print("         A software to help your trade efforts.")
    print("         To choos Trade type '1'")
    space()
    print("-Distance software Vers. 1.0")
    print("         A software to tell the distances between towns")
    print("         To choose Distance type '2'")
    space()
    print("-Calculator Vers 1.0")
    print("         A simple calculator for +, -, * and /.")
    print("         To choose Calculator type '3'")
    space()
    print("-More coming soon")
    space()
    lines()
    space()
    #second while loop
    t=1
    while t==1:
        print("To see the available software type 'show.software'.")   
        print("Type what software you want to load:")
        a=input()
        #testing input
        try:
            if a=="1":
                lines()
                lines()
                print("Loading Trade.py.....")
                lines()
                lines()
                import Trade
                t=0
            elif a=="2":
                lines()
                lines()
                print("Loading Distance.py....")
                lines()
                lines()
                import distance
                t=0
            elif a=="3":
                lines()
                lines()
                print("Loading Calculator.py....")
                lines()
                lines()
                import calculator
                t=0
            else:
                print("Use one of the options above .")
                
        except:
            print("Use one of the options above.")
    
    space()
    space()
    lines()
    print("Do you want to load another software?")
    print("y/n")
    k=input()
    space()
    space()
    #testing input
    #third while loop
    t=1
    while t==1:
        try:
            if k=="y":
                lines()
                lines()
                print("Restarting Hub")
                lines()
                lines()
                space()
                space()
                t=0
            elif k=="n":
                print("Good Bye")
                t=0
                end=0
            else:
                print("Use 'y' or 'n'.")
        except:
            print("Use 'y' or 'n'.")

            
            

