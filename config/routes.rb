#ActionController::Routing::Routes.draw do |map|
  EnglishScript::Application.routes.draw do

    # The priority is based upon order of creation: first created -> highest priority.
  resources :commands

  resources :variables

  resources :parameters

  resources :functions

    resources :functions

    resources :variables

    resources :parameters


  resources :nodes

  resources :users

  resources :users

  resources :rights

  resources :permissions

  resources :groups

  resources :users

  resources :statements

  resources :values

  resources :contexts

  resources :nodes

  resources :users

  resources :statements

  resources :values

  resources :nodes

  resources :statements


  get '/sandbox' => 'sandbox#index'
  get '/' => 'sandbox#index'
  #match '/script' => 'sandbox#index'

  resources :scripts
  match 'run'  => 'scripts#run', :via => :post
  match 'run/:id'  => 'scripts#run', :via => :post
  match 'save_and_run/:id'  => 'scripts#save_and_run', :via => :post


  # connect 'scripts/:action/:id'
  # connect 'scripts/:action/:id.:format'
  get '/scripts/destroy_orphaned_versions/' => 'scripts#destroy_orphaned_versions'
  get '/scripts/destroy_orphaned_versions/:id' => 'scripts#destroy_orphaned_versions'

  #connect 'scripts/:id', :controller => 'scripts', :action => 'run',:method => "post"


  # Sample of regular route:
  #   connect 'products/:id', :controller => 'catalog', :action => 'view'
  # Keep in mind you can assign values other than :controller and :action

  # Sample of named route:
  #   purchase 'products/:id/purchase', :controller => 'catalog', :action => 'purchase'
  # This route can be invoked with purchase_url(:id => product.id)

  # Sample resource route (maps HTTP verbs to controller actions automatically):
  #   resources :products

  # Sample resource route with options:
  #   resources :products, :member => { :short => :get, :toggle => :post }, :collection => { :sold => :get }

  # Sample resource route with sub-resources:
  #   resources :products, :has_many => [ :comments, :sales ], :has_one => :seller

  # Sample resource route with more complex sub-resources
  #   resources :products do |products|
  #     products.resources :comments
  #     products.resources :sales, :collection => { :recent => :get }
  #   end

  # Sample resource route within a namespace:
  #   namespace :admin do |admin|
  #     # Directs /admin/products/* to Admin::ProductsController (app/controllers/admin/products_controller.rb)
  #     admin.resources :products
  #   end

  # You can have the root of your site routed with root -- just remember to delete public/index.html.
  # root :controller => "welcome"

  # See how all your routes lay out with "rake routes"

  # Install the default routes as the lowest priority.
  # Note: These default routes make all actions in every controller accessible via GET requests. You should
  # consider removing the them or commenting them out if you're using named routes and resources.
  #connect ':controller/:action/:id'
  #connect ':controller/:action/:id.:format'
end
