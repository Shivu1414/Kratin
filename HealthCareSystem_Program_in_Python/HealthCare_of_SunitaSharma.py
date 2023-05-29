#Maintain healthy to Sunita Sharma.
# This program remind sunita sharma to do exercizes and eat healthy food and water at particuler time in a day for become healthy.
#Here we fixed time like when sunita sharma need to drink water, eat medicines, and need to do eversize.

from pygame import mixer
from datetime import datetime

from time import time
def music_play(file, stopper):
    mixer.init()
    mixer.music.load(file)
    mixer.music.play()
    while True:
        a =input("Enter for stop = ")
        if a== stopper: 
            mixer.music.stop()
            break

def log_fun(msg):
    with open("SunitaSharma_logs.txt", "a") as f:
        f.write(f"{msg} {datetime.now()} and\n")

#Here we had given time in seconds.
if __name__=='__main__':
     init_water = time()
     init_eye = time()
     init_exercize = time()
     init_medicine = time()
     water_sec = 30
     exer_sec = 50
     eye_sec = 10
     medicine_sec= 500

print("\n")
while True:
    if (time() - init_water) > water_sec:
        print("\n")
        print("Hello sunita Sharma, This time you need to drink water for hydrate. Enter done after drink.")
        print("Because", water_sec, "second is over from when you drank water.")
        music_play("SunitaSharma.mp3","done")
        init_water = time()
        log_fun("drank water at ")

    if(time() - init_eye) > eye_sec:
        print("\n")
        print("Hello sunita Sharma, This time you need to do some eye exercize. Enter done after doing.")
        print("Because",eye_sec , "second is over from when you done your eye exercize.")
        music_play("SunitaSharma.mp3","done")
        init_eye =time()
        log_fun("eye exercize at ")

    if(time() - init_exercize) > exer_sec:
        print("\n")
        print("Hello sunita Sharma, This time you need to do Yoga for become healthy. Enter done after doing.")
        print("Because",exer_sec , "second is over from when you done your Yoga.")
        music_play("SunitaSharma.mp3","done")
        init_exercize = time()
        log_fun("Exercize at ")

    if (time() - init_medicine) > medicine_sec:
        print("\n")
        print("Hello sunita Sharma, This time you need to eat your medicines. Enter done after doing.")
        print("Because", medicine_sec, "second is over from when you eat your medicine.")
        music_play("SunitaSharma.mp3", "done")
        init_medicine = time()
        log_fun("Exercize at ")





