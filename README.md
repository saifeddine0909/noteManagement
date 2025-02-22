How the SRP is applied in my code :

-The car class only handles the car information as set by the constructor (no fuel consumption and no traveled distance)
-The car data handles only the data that may occur after usage
-The car park only manages the list of cars

How the Liskove principle is applied :

By creating the car management interface i am not using the car information directly inside the car park class
!! Question : should i also separate the methods for the fuel consumption per distance and the total park consumption in separate classes ??


 
