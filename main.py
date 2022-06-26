import telebot
from geopy import MapBox
bot=telebot.TeleBot('5454972460:AAGzSo4M51MjvfX7IREY8XOZMNiGYRqPfJY')
@bot.message_handler(content_types=['text'])
def mes(message):
    a=message.text
    location = MapBox(api_key='pk.eyJ1IjoiYXdhcjM5IiwiYSI6ImNsNHBlaWdtMzBlZjUzam1ueTFuN3ljNGoifQ.Z1rstt65W4xE1n5hJDuRIA',domain='api.mapbox.com').geocode(a)
    bot.send_message(message.chat.id, location.address)
    print(dir(location))
    print(location.raw)
bot.polling(none_stop=True)