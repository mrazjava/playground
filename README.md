# Github Playground
A dummy project I use to test github features that are not familiar to me. For example, I play around here when I experiment with github 
actions, webhooks, and generally features that interact with pushes to a repo.

The sources in this repo for all practical purposes are irrelevant. I started with a stock boot 
project via [Spring Initializr](https://start.spring.io/), just so there is something to use for 
a build pipeline.

## Github Actions
Measurable traces of my tests on this playground can be found in the [Actions](https://github.com/mrazjava/playground/actions) tab. It contains jobs that executed as a result of my specific experiments. Resulting [workflow files](https://github.com/mrazjava/playground/tree/master/.github/workflows) contain tested CI recipes I use in real projects.

Documentation I find useful:
- [Workflow Syntax](https://help.github.com/en/actions/reference/workflow-syntax-for-github-actions)
- [Variables & Steps](https://www.edwardthomson.com/blog/github_actions_15_sharing_data_between_steps.html)

## Handy Tools
* [SSH](https://github.com/marketplace/actions/debugging-with-tmate) debugging of github action workflows.
* [grip](https://github.com/joeyespo/grip) preview renderer using github markdown API, allows to tweak readme locally before sending final version to gitub (on ubuntu `sudo apt install grip`)
