FROM adoptopenjdk:11-jre-hotspot

ENV USER flamingo
RUN useradd -m ${USER}

RUN mkdir /opt/app
WORKDIR /opt/app

COPY target/playground.jar /opt/app/

USER ${USER}
ENTRYPOINT ["java", "-cp", "/opt/app/playground.jar"]
CMD ["-Dloader.main=com.github.mrazjava.playground.PlaygroundApplication", "org.springframework.boot.loader.PropertiesLauncher"]

EXPOSE 8080