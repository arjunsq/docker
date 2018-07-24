FROM debian 

COPY script.sh /script.sh

CMD ["./script.sh"]

COPY app/App.java /root/App.java

CMD ["javac","/root/App.java"]

CMD ["apt-get","update"]

CMD ["apt-get","install","default-jdk"]

CMD ["javac","/root/App.java"]
