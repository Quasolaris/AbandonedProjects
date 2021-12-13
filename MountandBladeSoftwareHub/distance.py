#Mount & Blade: Warband Distance software Vers. 1.0
#Functions

#i=town input
#end=software loop variable
#t=while loop variable

def lines():
    print("----------------------------------------------------------------------------------------------------------------------")
def space():
    print()
def help(a):
    if a=="show.towns":
        lines()
        space()
        print("Available towns:")
        space()
        print("Halmar, Ichamur, Narra, Tulga, Sargoth, Tihr, Wercheg,")
        print("Jelkala, Veluca, Yalen, Dhirim, Praven, Suno, Uxkhal, Khudan,")
        print("Curaw, Khudan, Reyvadin, Rivacheg, Ahmerrad, Bariyye, Durquba, Shariz.")
        space()
        lines()

space()
space()
lines()
print("Mount & Blade: Warband Distance software Vers. 1.0")
lines()
space()
space()
lines()
print("This Software will show you the travel time between towns in days.")
space()
space()
#starting while loop
end=1
while end==1:
    t=1
    while t==1:
        space()
        print("To see a list of available towns type 'show.towns'.")
        print("Insert the starting town:")
        i=input()
        space()
        lines()
        #testing input 
        try:
            if i=="ichamur" or i=="tulga" or i=="narra" or i=="halmar" or i=="curaw" or i=="reyvadin" or i=="rivacheg" or i=="wercheg" or i=="sargoth" or i=="tihr" or i=="praven" or i=="suno" or i=="uxkhal" or i=="dhirim" or i=="veluca" or i=="yalen" or i=="jelkala" or i=="shariz" or i=="durquba" or i=="ahmerrad" or i=="bariyye" or i=="khudan":
                print("You've chosen:", i)
                t=0
            elif i=="show.towns":
                help(i)
                
            else:
                space()
                print("Please only use lowercase letters and check if you had a typo.")
                
        except:
            space()
            print("Please only use lowercase letters and check if you had a typo.")
            
    space()
    lines()
    print("These are the expected travel times to other towns:")
    print("The travel times include SHORT camping at night.")
    space()
    #travel time informations
    if i=="ichamur":
        print("Distance 1 day:")
        print("Halmar, Narra, Tulga, Khudan, Reyvadin and Ahmerrad.")
        space()
        print("Distance 2 days:")
        print("Dhirim, Curaw, Rivacheg, Durquba and Bariyye.")
        space()
        print("Distance 3 days:")
        print("Veluca, Shariz, Sargoth and Wercheg.")
        space()
        print("Other Towns are 4 days.")
    elif i=="halmar":
        print("Distance 1 day:")
        print("Reyvadin, Narra, Durquba, Shariz and Dhirim.")
        space()
        print("Distance 2 days:")
        print("Khudan, Curaw, Uxkhal and Veluca.")
        space()
        print("Distance 3 days:")
        print("Suno, Jelkala, Praven, Tihr, Sargoth, Wercheg and Rivacheg.")
        space()
        print("Other towns are 4 days.")
        
    elif i=="narra":
        print("Distance 1 day:")
        print("Ichamur, Tulga, Halmar, Ahmerrad, Durquba and Dhirim.")
        space()
        print("Distance 2 days:")
        print("Reyvadin, Bariyye and Shariz.")
        space()
        print("Distance 3 days:")
        print("Curaw, Khudan, Uxkhal and Veluca")
        space()
        print("Other towns are 4 days.")
        
    elif i=="tulga":
        print("Distance 1 day:")
        print("Ichamur, Bariyye, Ahmerrad and Narra.")
        space()
        print("Distance 2 days:")
        print("Halmar, Durquba, Khudan, Dhirim and Reyvadin.")
        space()
        print("Distance 3 days:")
        print("Curaw, Rivacheg, Shariz, Veluca and Uxkhal.")
        space()
        print("Other towns are 4 days.")
    elif i=="curaw":
        print("Distance 1 day:")
        print("Khudan, Reyvadin, Rivacheg, and Sargoth.")
        space()
        print("Distance 2 days:")
        print("Wercheg, Tihr, Dhirim and Ichamur.")
        space()
        print("Distance 3 days:")
        print("Tulga, Narra, Halmar, Uxkhal and Suno.")
        space()
        print("Other towns are 4 days.")
    elif i=="reyvadin":
        print("Distance 1 day:")
        print("Curaw, Khudan, Rivacheg, Narra, Ichamur, Halmar, Wercheg, Dhirim and Sargoth.")
        space()
        print("Distance 2 days:")
        print("Uxkhal, Tihr, Suno and Tulga")
        space()
        print("Distance 3 days:")
        print("Praven, Veluca and Shariz")
        space()
        print("Other towns are 4 days.")
    elif i=="rivacheg":
        print("Distance 1 day:")
        print("")
        space()
        print("Distance 2 days:")
        print("")
        space()
        print("Distance 3 days:")
        print("")
        space()
        print("Other towns are 4 days.")  
    elif i=="wercheg":
        print("Distance 1 day:")
        print("Rivacheg, Khudan, Curaw, Reyvadi and Sargoth.")
        space()
        print("Distance 2 days:")
        print("Ichamur, Tihr and Dhirim.")
        space()
        print("Distance 3 days:")
        print("Suno, Uxkhal, Praven, Halmar, Tulga and Narra.")
        space()
        print("Other towns are 4 days.")
    elif i=="sargoth":
        print("Distance 1 day:")
        print("Tihr, Wercheg, Curaw and Reyvadin.")
        space()
        print("Distance 2 days:")
        print("Rivacheg, Khudan, Dihirim and Suno.")
        space()
        print("Distance 3 days:")
        print("Praven, Uxkhal, Halmar, Narra and Veluca.")
        space()
        print("Other towns are 4 days.") 
    elif i=="tihr":
        print("Distance 1 day:")
        print("Sargoth, Wercheg, Praven, Suno, Curaw and Reyvadin.")
        space()
        print("Distance 2 days:")
        print("Rivacheg, Khudan, Uxkhal and Dihirim.")
        space()
        print("Distance 3 days:")
        print("Veluca, Halmar, Narra and Tulga.")
        space()
        print("Other towns are 4 days.")   
    elif i=="praven":
        print("Distance 1 day:")
        print("Suno, Uxkhal and Tihr.")
        space()
        print("Distance 2 days:")
        print("Dihirm, Sargoth, Veluca and Yalen.")
        space()
        print("Distance 3 days:")
        print("Reyvadin, Curaw, Jelkala, Halmar and Narra.")
        space()
        print("Other towns are 4 days.")    
    elif i=="suno":
        print("Distance 1 day:")
        print("Praven, Uxkhal and Tihr.")
        space()
        print("Distance 2 days:")
        print("Dihirm, Sargoth, Veluca and Yalen.")
        space()
        print("Distance 3 days:")
        print("Reyvadin, Curaw, Jelkala, Halmar and Narra.")
        space()
        print("Other towns are 4 days.")   
    elif i=="uxkhal":
        print("Distance 1 day:")
        print("Praven, Suno, Dhirim and Velkuca.")
        space()
        print("Distance 2 days:")
        print("Yalen, Jelkala, Halmar, Tihr, Sargoth and Narra.")
        space()
        print("Distance 3 days:")
        print("Curaw, Reyvadin, Ichamur, Shariz Narra and Tulga.")
        space()
        print("Other towns are 4 days.") 
    elif i=="dhirim":
        print("Distance 1 day:")
        print("Suno, Uxkhal, Halmar, Narra and Reyvadin.")
        space()
        print("Distance 2 days:")
        print("Praven, Veluca, Tulga, Ichamur, Curaw Tihr and Sargoth.")
        space()
        print("Distance 3 days:")
        print("Jelkala, Shariz, Durquba, Wercheg and Khudan.")
        space()
        print("Other towns are 4 days.")  
    elif i=="veluca":
        print("Distance 1 day:")
        print("Jelkala, Uxkhal and Yalen.")
        space()
        print("Distance 2 days:")
        print("Suno, Shariz, Praven, Dhirim and Halmar.")
        space()
        print("Distance 3 days:")
        print("Narra, Tulga, Reyvadin, Tihr and Sargoth.")
        space()
        print("Other towns are 4 days.")  
    elif i=="jelkala":
        print("Distance 1 day:")
        print("Veluca and Yalen.")
        space()
        print("Distance 2 days:")
        print("Uxkhal, Shariz and Suno.")
        space()
        print("Distance 3 days:")
        print("Dhirim, Praven, Halmar, Durquba and Narra.")
        space()
        print("Other towns are 4 days.")  
    elif i=="shariz":
        print("Distance 1 day:")
        print("")
        space()
        print("Distance 2 days:")
        print("")
        space()
        print("Distance 3 days:")
        print("")
        space()
        print("Other towns are 4 days.")
    elif i=="durquba":
        print("Distance 1 day:")
        print("Shariz, Ahmerrad, Bariyye, Halmar and Narra.")
        space()
        print("Distance 2 days:")
        print("Tulga, Ichamur and Dhirmim.")
        space()
        print("Distance 3 days:")
        print("Reyvadin, Uxkhal, Veluca and Jelkala.")
        space()
        print("Other towns are 4 days.")  
    elif i=="ahmerrad":
        print("Distance 1 day:")
        print("Durquba, Bariyye, Halmar and Tulga.")
        space()
        print("Distance 2 days:")
        print("Narra, Sharizt, Ichamur and Dhirmim.")
        space()
        print("Distance 3 days:")
        print("Reyvadin, Uxkhal, Veluca and Jelkala.")
        space()
        print("Other towns are 4 days.") 
    elif i=="bariyye":
        print("Distance 1 day:")
        print("Ahmerrad and Durquba.")
        space()
        print("Distance 2 days:")
        print("Tulga and Halmar.")
        space()
        print("Distance 3 days:")
        print("Shariz, Narra and Ichamur.")
        space()
        print("Other towns are 4 days.")  
    elif i=="khudan":
        print("Distance 1 day:")
        print("Curaw, Rivacheg, Reyvadin and Ichamur.")
        space()
        print("Distance 2 days:")
        print("Wercheg, Sargoth, Dhirim and Tulga.")
        space()
        print("Distance 3 days:")
        print("Narra, Halmar, Tihr and Uxkhal.")
        space()
        print("Other towns are 4 days.")   
    #asking if program should restart
    space()
    lines()
    print("Do you want to search an other town? y/n")
    t=1
    #testing input
    while t==1:
        a=input()
        #testing input
        help(a)
        try:
            if a=="y":
                lines()
                lines()
                print("Restarting database")
                lines()
                lines()
                t=0
                end=1
            elif a=="n":
                space()
                space()
                lines()
                lines()
                print("Going back to Hub.")
                lines()
                lines()
                space()
                space()
                t=0
                end=0
            else:
                print("Please use y or n.")
                t=1 
        except:
            print("Please use y or n.")
            t=1