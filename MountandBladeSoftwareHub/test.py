class Village:
    Distance = ''

    def __init__(self, name):
        self.name = name    # instance variable unique to each instance

Ichamur = Village('Narra, Tulga, Reyvadin, Tihr and Sargoth.')
Ichamur.Distance=("Narra, Tulga, Reyvadin, Tihr and Sargoth.")
Belga = Village('Narra, Reyvadin, Tihr and Sargoth.')
Belga.Distance=("Narra, Reyvadin, Tihr and Sargoth.")
x=1
z=Belga
while x==1:
    print("Hello")
    print(z.Distance)
    k=input()
"""class Dog:
    
    kind = 'canine'         # class variable shared by all instances

    def __init__(self, name):
        self.name = name    # instance variable unique to each instance
d = Dog('Fido')
e = Dog('Buddy')
d.kind                  # shared by all dogs
#print(d.kind)
k=input()"""