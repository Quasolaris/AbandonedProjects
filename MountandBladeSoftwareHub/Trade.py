#Mount & Blade: Warband Trade Software Version 1.5
def lines():
    print("----------------------------------------------------------------------------------------------------------------------")
def space():
    print()
#help menu
def help(a):
    if a=="show.help":
        lines()
        space()
        print("Type following for more information:")
        print("'show.help'  - Displays help menu.")
        print("'show.towns' - Displays a list of available towns.")
        print("'show.items' - Displays a list of available items.")
        print("'show.prices'- Displays a list of buy/sell recommendations.")
        print("'back.hub' -   Goes back to the Hub. (Not functional)")
        space()
        lines()
    elif a=="show.towns":
        lines()
        space()
        print("Available towns:")
        space()
        print("Halmar, Ichamur, Narra, Tulga, Sargoth, Tihr, Wercheg,")
        print("Jelkala, Veluca, Yalen, Dhirim, Praven, Suno, Uxkhal, Khudan,")
        print("Curaw, Khudan, Reyvadin, Rivacheg, Ahmerrad, Bariyye, Durquba, Shariz.")
        space()
        lines()
    elif a=="show.items":
        lines()
        space()
        print("Available items:")
        space()
        print("Oil, Silk, Wine, Iron, Linen, Dyes, Butter,")
        print("Spice, Tools, Salt, Ale, Furs, Hides, Pottery, Wool cloth.")
        space()
        lines()
        
    elif a=="show.prices":
        lines()
        space()
        print("Most profitable goods:")
        space()
        print("Iron. BUY under 150, SELL over 300")
        print("Salt. BUY under 150, SELL over 270")
        print("Oil. BUY under 320, SELL over 450")
        print("Tools. BUY under 380, SELL over 450")
        print("Velvet. BUY under 700, SELL over 950-1000")
        print("Wine. BUY under 200, SELL over 300")
        print("Spice. BUY under 600, SELL over 800")
        print("Flax. BUY under 100, SELL over 150")
        print("Linen. BUY under 220, SELL over 350")
        print("Wool Cloth. BUY under 200, SELL over 270")
        space()
        space()
        print("Filler Goods:")
        print("Buy these to avoid travelling empty, if the above are not available.")
        space()
        print("Date Fruit. BUY under 70, SELL over 120")
        print("Fish. BUY under 30, SELL over 100")
        print("Hides. BUY under 90, SELL over 100")
        print("Grain. BUY under 30, SELL over 50")
        space()
        lines()      
#a=help function
#i=Purchase town
#q=Item
#g=amount of items
#k=purchase price
#p=Trade penalty (Sell)
#o=Trade penalty (Buy)
#t=while loop
#end=program loop

#Trade penalties
p=0.9
o=1.4
space()
space()
space()
space()
lines()
print("Mount & Blade: Warband Trade Software Version 1.5")
lines()
print("Database last update: 16.04.1258")
lines()
space()
print("This software will show you what prices you have to expect for different items.")
print("Keep in mind that it will only show towns with the best prices.")
print("Simply follow the instructions and trade thoughtfully.")
print("All informations are free of charge and can differ from actual prices!")
space()
lines()
space()
print("Instructions:")
print("-To access the help menu type 'show.help'.")
print("-Insert the asked parameters.")
print("-Take the informations and use them carefully.")
space()
lines()
#starting softwarewloop
end=1
while end==1:
    #Initializing while loop, variable is t
    space()
    print("-To skip this step type 's'")
    space()
    t=1
    while t==1:
        #asking for purchase city
        print("Insert town/village of purchase:")
        i = input()
        #checking input
        help(i)
        try:
            if i=="ichamur" or i=="tulga" or i=="narra" or i=="halmar" or i=="curaw" or i=="reyvadin" or i=="rivacheg" or i=="wercheg" or i=="sargoth" or i=="tihr" or i=="praven" or i=="suno" or i=="uxkhal" or i=="dhirim" or i=="veluca" or i=="yalen" or i=="jelkala" or i=="shariz" or i=="durquba" or i=="ahmerrad" or i=="bariyye" or i=="khudan":
                print("You've chosen:", i)
                t=0
            elif i=="s":
                i="N/A"
                t=0
            else:
                print("Please only use lowercase letters and check if you had a typo.")
                t=1
        except:
            t=1
    space()
    lines()
    t=1
    while t==1:
        #asking what item user wants to buy/sell
        print("Insert item:")
        q = input()
        #checking input
        help(q)
        try:
            if q=="wine" or q=="silk" or q=="oil" or q=="iron" or q=="linen" or q=="dyes" or q=="butter" or q=="spice" or q=="tools" or q=="salt" or q=="ale" or q=="furs" or q=="hides" or q=="pottery" or q=="wool cloth":
                print("You've chosen:", q)
                t=0
            else:
                print("Please only use lowercase letters and check if you had a typo.")
                print("It is also possible that the item is not yet in our database.")
                t=1
        except:
            t=1
    space()
    lines()
    space()
    #third while loop
    #asking for purchase price
    t=1
    while t==1:
        print("Insert purchase price of last bought item unit:")
        k=input()
        #testing input
        help(k)
        try:
            k=int(k)
            t=0
        except:
            print("Use numbers.")
            t=1

    space()
    lines()
    space()
    #fourth while loop
    t=1
    while t==1:
        #asking the amount if items
        print("Insert amount of items:")
        g = input()
        #testing input
        help(g)
        try:
            g=int(g)
            print("You've inserted:", g,"items")
            t=0
        except:
            print("Use numbers.")
            t=1
    space()
    lines()
    space()
    #summing inputs
    print("You've summited the following parameters:")
    print("Town of purchase:", i)
    print("Item:", g, q,"(s)")
    print("Price of last item unit:", k, "Denars")
    print("Purchase penalty:", int(o*100),"%")
    print("Sell penalty:", int(p*100),"%")
    space()
    space()
    space()
    lines()
    space()
    space()
    #database search
    print("Information that can be found in our database with these parameters:")
    lines()
    if q=="hides":
        print("Lowest expected selling price per unit: 80 Denars")
        print("Highest expected selling price per unit: 112 Denars")
        space()
        print("Best towns/villages to buy", q, ": N/A")
        space()
        print("Best towns to sell", q, ":")
        print("Dhirim")
        print("Expected profit with", g, q,"(s):")
        print(80*g, "-", 112*g, "Denars")
    elif q=="wine":
        print("Lowest expected selling price per unit: 150 Denars")
        print("Highest expected selling price per unit: 288 Denars")
        space()
        print("Best towns/villages to buy", q, ":")
        print("Veluca, Sargoth and Yalen.")
        space()
        print("Best towns to sell", q, ":")
        print("Durquba")
        print(240*g, "-", 268*g, "Denars")
        space()
        print("Shariz")
        print(230*g, "-", 288*g, "Denars")
        space()
        print("Bariyye")
        print(240*g, "-", 286*g, "Denars")
        space()
        print("Ricacheg")
        print(150*g, "-", 215*g, "Denars")
        space()
        print("Tulga")
        print(230*g, "-", 286*g, "Denars")
        space()
        print("Dhirim")
        print(150*g, "-", 209*g, "Denars")
    elif q=="silk":
        print("Lowest expected selling price per unit: 460 Denars")
        print("Highest expected selling price per unit: 570 Denars")
        space()
        print("Best towns/villages to buy", q, ":")
        print("Jelkala and Rivacheg.")
        space()
        print("Best towns to sell", q, ":")
        print("Durquba")
        print(500*g, "-", 558*g, "Denars")
        space()
        print("Dhirim")
        print(500*g, "-", 558*g, "Denars")
        space()
        print("Khudan")
        print(460*g, "-", 534*g, "Denars")
        space()
        print("Wercheg")
        print(480*g, "-", 540*g, "Denars")
        space()
        print("Sargoth")
        print(500*g, "-", 570*g, "Denars")
    elif q=="iron":
        print("Lowest expected selling price per unit: 190 Denars")
        print("Highest expected selling price per unit: 282 Denars")
        space()
        print("Best towns/villages to buy", q, ":")
        print("Curaw and Burglen (village near Dhirim).")
        space()
        print("Best towns to sell", q, ":")
        print("Tulga")
        print(200*g, "-", 282*g, "Denars")
        space()
        print("Reyvadin")
        print(190*g, "-", 264*g, "Denars")
    elif q=="linen":
        print("Lowest expected selling price per unit: 160 Denars")
        print("Highest expected selling price per unit: 228 Denars")
        space()
        print("Best towns/villages to buy", q, ": N/A")
        space()
        print("Best towns to sell", q, ":")
        print("Dhirim")
        print(160*g, "-", 228*g, "Denars")
    elif q=="dyes":
        print("Lowest expected selling price per unit: 140 Denars")
        print("Highest expected selling price per unit: 208 Denars")
        space()
        print("Best towns/villages to buy", q, "")
        print("Ahmerrad, Fishara (village near Bariyye) and Mijayet (village near Ahmerrad).")
        space()
        print("Best towns to sell", q, ":")
        print("Tulga")
        print(140*g, "-", 190*g, "Denars")
        space()
        print("Ichamur")
        print(150*g, "-", 202*g, "Denars")
        space()
        print("Sargoth")
        print(160*g, "-", 208*g, "Denars")
    elif q=="butter":
        print("Lowest expected selling price per unit: N/A")
        print("Highest expected selling price per unit:  N/A")
        space()
        print("Best towns/villages to buy", q, ": N/A")
        space()
        print("Best towns to sell", q, ": N/A")
    elif q=="spice":
        print("Lowest expected selling price per unit: 730 Denars")
        print("Highest expected selling price per unit: 888 Denars")
        space()
        print("Best towns/villages to buy", q, ":")
        print("Tulga and Ichamur.")
        space()
        print("Best towns to sell", q, ":")
        print("Khudan")
        print(730*g, "-", 827*g, "Denars")
        space()
        print("Halmar")
        print(800*g, "-", 888*g, "Denars")
        space()
        print("Narra")
        print(750*g, "-", 827*g, "Denars")
        space()
        print("Uxkhal")
        print(790*g, "-", 880*g, "Denars")
        space()
        print("Jelkala")
        print(760*g, "-", 836*g, "Denars")
    elif q=="tools":
        print("Lowest expected selling price per unit: N/A")
        print("Highest expected selling price per unit:  N/A")
        space()
        print("Best towns/villages to buy", q, ": N/A")
        space()
        print("Best towns to sell", q, ": N/A")
    elif q=="salt":
        print("Lowest expected selling price per unit: 190 Denars")
        print("Highest expected selling price per unit: 280 Denars")
        space()
        print("Best towns/villages to buy", q, ":")
        print("Tihr, Tulga, Wercheg, Bariyye and Dusturil (village near Tulga).")
        space()
        print("Best towns to sell", q, ":")
        print("Praven")
        print(200*g, "-", 280*g, "Denars")
        space()
        print("Khudan")
        print(190*g, "-", 255*g, "Denars")
        space()
        print("Curaw")
        print(200*g, "-", 267*g, "Denars")
        space()
        print("Reyvadin")
        print(200*g, "-", 260*g, "Denars")
        space()
        print("Veluca")
        print(190*g, "-", 255*g, "Denars")
        space()
        print("Ichamur")
        print(200*g, "-", 262*g, "Denars")
    elif q=="ale":
        print("Lowest expected selling price per unit: N/A")
        print("Highest expected selling price per unit: N/A")
        space()
        print("Best towns/villages to buy", q, ": N/A")
        space()
        print("Best towns to sell", q, ": N/A")
    elif q=="furs":
        print("Lowest expected selling price per unit: 200 Denars")
        print("Highest expected selling price per unit: 391 Denars")
        space()
        print("Best towns/villages to buy", q, ":")
        print("Tismirr (village near Khudan).")
        space()
        print("Best towns to sell", q, ":")
        print("Curaw")
        print(200*g, "-", 289*g, "Denars")
        space()
        print("Tihr")
        print(300*g, "-", 391*g, "Denars")
    elif q=="pottery":
        print("Lowest expected selling price per unit: 80 Denars")
        print("Highest expected selling price per unit: 115 Denars")
        space()
        print("Best towns/villages to buy", q, ":")
        print("Durquba, Ahmerrad and Fishara (village near Bariyye).")
        space()
        print("Best towns to sell", q, ":")
        print("Sargoth")
        print(80*g, "-", 115*g, "Denars")
    elif q=="oil":
        space()
        print("M'URICA FUCK YEAH!")
        space()
        print("Lowest expected selling price per unit: 340 Denars")
        print("Highest expected selling price per unit: 445 Denars")
        space()
        print("Best towns/villages to buy", q, ":")
        print("Suno and Uxkhal.")
        space()
        print("Best towns to sell", q, ":")
        print("Sargoth")
        print(340*g, "-", 391*g, "Denars")
        space()
        print("Praven")
        print(350*g, "-", 405*g, "Denars")
        space()
        print("Curaw")
        print(390*g, "-", 445*g, "Denars")
    elif q=="wool cloth":
        print("Lowest expected selling price per unit: 170 Denars")
        print("Highest expected selling price per unit: 227 Denars")
        space()
        print("Best towns/villages to buy", q, ": N/A")
        space()
        print("Best towns to sell", q, ":")
        print("Uxkhal")
        print(170*g, "-", 227*g, "Denars")
        space()
    #asking to search another item
    #starting fifth while loop
    print("Do you want to search another item? y/n")
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
        






