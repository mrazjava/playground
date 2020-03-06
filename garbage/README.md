# Triggers
Files in this directory serve no purpose other than trigger (and control) github action pipelines. Workflows are 
usually named in accordance with file which triggers it:
```
BRANCH-FILETRIGGER.yml
```
for example:
```
master-mvnver.yml
```
is a workflow which is triggered when push to `mvnver` file on `master` branch occurs.