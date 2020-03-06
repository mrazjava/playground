# Triggers
Files in this directory serve no purpose other than trigger (and control) github action pipelines. Workflows are 
usually named after the trigger file which triggers it. Just for fun, trigger files are named after animals ;-)

## Workflow Lessons
A few lessons learned the hard way...

### env variables
Variables cannot be shared between jobs other thank sharing a pre-defined (read-only) value. If a need to share 
variable between jobs arises, merge steps from multiple jobs which require variable sharing into one job and use 
`::set-output` with `${ steps.<id>.outputs.<name>}`.