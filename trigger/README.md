# Triggers
Files in this directory serve no purpose other than trigger (and control) github action pipelines. Workflows are 
usually named after the trigger file which triggers it. Just for fun, trigger files are named after animals ;-)

## Workflow Lessons
A few lessons learned the hard way...

### env variables
Variables cannot be shared between jobs. Either make one job longer (more steps) or 
[persist](https://github.com/actions/starter-workflows/issues/68#issuecomment-524937002) a variable to disk.