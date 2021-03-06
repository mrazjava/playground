# Triggers
Files in this directory serve no purpose other than trigger (and control) github action pipelines. Workflows are 
usually named after the trigger file which triggers it. Just for fun, trigger files are named after animals ;-)

## Workflow Lessons
A few lessons learned the hard way...

### env variables
Variables cannot be shared between jobs other thank sharing a pre-defined (read-only) value. If a need to share 
variable between jobs arises, either merge steps from multiple jobs which require variable sharing into one job 
and use `::set-output` with `${ steps.<id>.outputs.<name>}`; or, [persist workflow state](https://help.github.com/en/actions/configuring-and-managing-workflows/persisting-workflow-data-using-artifacts#passing-data-between-jobs-in-a-workflow) 
by uploading/downloading artifacts as needed.

Here is a snippet of a detailed [explanation](https://github.community/t5/GitHub-Actions/Sharing-a-variable-between-jobs/td-p/38880) 
why it works like this:

> As jobs run in different runners, those runners are in different machines. Each job runs in a fresh instance 
> of the virtual environment specified by runs-on. It is not possible to share environment variables between 
> machines.  We don’t support to share variables between jobs. As you metioned artifacts, we would suggest you use it. 
> You can write the version into a file , upload it as artifact in one job and then download the artifacts in the 
> other job , read the file content. 

The [flamingo](https://github.com/mrazjava/playground/blob/master/.github/workflows/flamingo.yml) workflow implements 
the notion of state sharing across two jobs by uploading/downloading artifact data. The first job builds JAR and 
uploads all necessary artifacts. The second, uses these artifacts to echo out project version, and build a docker 
image off an already built JAR.