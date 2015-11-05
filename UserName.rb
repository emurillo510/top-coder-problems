#!/bin/ruby

# Goal: implementing the member registration system of an online dating site.
# when a new member signs up, it is possible that she initially chooses the same username
# as an existing member. The system must then inform the new member of the conflict
# and suggest a variant of the chosen name with a number attached to the end.

# If an existing member is named "FunkyMonkey", for example and a new member wants
# the same username, the simplest suggestion the system can make is "FunkyMoney1"
# If there is already a member by that name, the system must suggest "FunkyMonkey2"
# unless that variant is also taken.
# If all names from "FunkyMonkey1" through "FunkyMonkey9" are taken as well as the
# original "FunkyMonkey", the system moves on to consider "FunkeyMonkey10" and so on.
# The goal is to use the smallest possible number in the variant. Note that each 
# username consists of letters (the characters from 'a' to 'z' and from 'A' to 'Z')
# and numerals ('0' to '9')

# You are given a String[] existingNames, containing all usernames that have already
# been registered in the system. 

# You are also given a single String, newName
# containing the username that a new member wants to use. In the vent of a conflict
# this member will accept the suggestion offered by your system in accordance with
# principles above. Return a String containing the username finally assigned 
# to the new member.

class UserName

	#while existing names has new name
	   #suggest new name
    #return new name
	
    def new_member(existing_names, input_name)

    	new_name = input_name
    	while existing_names.include?(new_name) 
    		new_name = suggest_name(new_name)
    	end
    	puts new_name + " is available."
    end

    def suggest_name(new_name)
    	numbers = new_name.gsub(/\D/, '').to_i
    	numbers += 1
    	new_name.gsub!(/\d\s?/, "")
    	new_name << numbers.to_s
    end
end


user_name = UserName.new
#existing_names = ["MasterOfDisaster", "DingBat", "Orpheus", "WolfMan", "MrKnowItAll"]
existing_names = ["Bart4", "Bart5", "Bart6", "Bart7", "Bart8", "Bart9", "Bart10",
 "Lisa", "Marge", "Homer", "Bart", "Bart1", "Bart2", "Bart3",
 "Bart11", "Bart12"]
input_name = "Bart"

user_name.new_member(existing_names, input_name)