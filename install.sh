gem install wordnet-defaultdb
cd lib
git submodule add "git@github.com:pannous/english-script.git" 
cd english-script
bundle install #english script
cd ../..
bundle install #rails app
