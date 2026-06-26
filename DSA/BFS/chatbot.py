import random 

name = "Suhas Kavade"
weather = "Sunny"
mood = "happy"

responses={
    "what is your name":[
        f"my name is {name}",
        f"they call me {name}",
        f"i am {name}"
    ],
    "how are you":[
        f"I am {mood}",
        f"I am feeling {mood}",
        f"{mood}!,what about you?"
    ],
    "what's today's weather": [
        f"It is {weather} today",
        f"The weather is {weather}"
    ],
    " ":[
        "i didn't understand that",
        'can you say that again'
    ],
    "default":[
        "try asking something else",
        "sorry i dont understand"
    ]

}

def process_input(message):
    if "name" in message:
        return "what is your name"
    elif "weather" in message:
        return "what's today's weather"
    elif "how are" in message:
        return "how are you"
    else:
        return " "
    
def get_response(message):
    if message in responses:
        return random.choice(responses[message])
    else:
        return random.choice(responses["default"])
    
print("Bot: Hello! type 'exit' to stop ")

while(True):
    user_input = input("You:").lower()

    if user_input in ["exit","stop"]:
        print("Good Bye")
        break
    
    mapped = process_input(user_input)
    response = get_response(mapped)
    print("Bot: ",response)