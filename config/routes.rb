#ActionController::Routing::Routes.draw do |map|
  EnglishScript::Application.routes.draw do

  resources :scripts

  resources :variables

  resources :parameters

  resources :functions

  match '/scripts/destroy_orphaned_versions/' => 'Scripts#destroy_orphaned_versions'
  match '/scripts/destroy_orphaned_versions/:id' => 'Scripts#destroy_orphaned_versions'

  match '/sandbox' => 'sandbox#index'
    match '/' => 'sandbox#index'
    #match '/script' => 'sandbox#index'


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

  # The priority is based upon order of creation: first created -> highest priority.
  match 'run'  => 'Scripts#run', :via => :post
  match 'run/:id'  => 'Scripts#run', :via => :post
  match 'save_and_run/:id'  => 'Scripts#save_and_run', :via => :post
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
