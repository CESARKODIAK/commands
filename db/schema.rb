# encoding: UTF-8
# This file is auto-generated from the current state of the database. Instead
# of editing this file, please use the migrations feature of Active Record to
# incrementally modify your database, and then regenerate this schema definition.
#
# Note that this schema.rb definition is the authoritative source for your
# database schema. If you need to create the application database on another
# system, you should be using db:schema:load, not running all the migrations
# from scratch. The latter is a flawed and unsustainable approach (the more migrations
# you'll amass, the slower it'll run and the greater likelihood for issues).
#
# It's strongly recommended to check this file into your version control system.

ActiveRecord::Schema.define(:version => 20121220113016) do

  create_table "accounts", :force => true do |t|
    t.string "account",  :limit => 150
    t.string "user",     :limit => 150
    t.string "password", :limit => 150
    t.string "deleted",  :limit => 1
  end

  create_table "concepts", :force => true do |t|
    t.integer "context"
    t.text    "name"
    t.text    "type"
    t.string  "deleted",    :limit => 1
    t.integer "version"
    t.integer "kind_id",                 :default => 1
    t.integer "context_id",              :default => 0, :null => false
  end

  create_table "contexts", :force => true do |t|
    t.text    "Index"
    t.integer "context"
    t.text    "name"
    t.string  "deleted",     :limit => 1
    t.text    "description"
  end

  create_table "english_words", :force => true do |t|
    t.string "word"
    t.string "kind", :limit => 40
  end

  create_table "frequencies_english", :force => true do |t|
    t.float  "frequency", :limit => 6
    t.string "word",      :limit => 200
  end

  create_table "frequencies_german", :force => true do |t|
    t.float  "frequency", :limit => 9
    t.string "word",      :limit => 200
  end

  create_table "functions", :force => true do |t|
    t.string   "name"
    t.integer  "context_id"
    t.integer  "kind_id"
    t.integer  "return_kind_id"
    t.text     "body"
    t.integer  "class_id"
    t.integer  "object_id"
    t.integer  "user_id"
    t.datetime "created_at"
    t.datetime "updated_at"
  end

  create_table "groups", :force => true do |t|
    t.string "deleted",     :limit => 1
    t.string "name"
    t.text   "description"
  end

  create_table "groups_contexts", :id => false, :force => true do |t|
    t.integer "context"
    t.integer "group"
  end

  create_table "groups_users", :id => false, :force => true do |t|
    t.integer "user"
    t.integer "group"
  end

  create_table "kinds", :force => true do |t|
    t.string "name", :default => "", :null => false
  end

  create_table "lastids", :force => true do |t|
    t.string "deleted", :limit => 1
  end

  create_table "nodes", :force => true do |t|
    t.string  "name",       :limit => 200
    t.text    "type"
    t.string  "deleted",    :limit => 1
    t.boolean "isvalid"
    t.boolean "parsed"
    t.integer "version"
    t.integer "user_id"
    t.integer "parent_id"
    t.integer "kind_id",                   :default => 1
    t.integer "context_id",                :default => 103, :null => false
  end

  add_index "nodes", ["id"], :name => "id", :unique => true
  add_index "nodes", ["name"], :name => "name"

  create_table "parameters", :force => true do |t|
    t.string   "name"
    t.string   "default"
    t.integer  "kind_id"
    t.integer  "method_id"
    t.datetime "created_at"
    t.datetime "updated_at"
  end

  create_table "permissions", :force => true do |t|
    t.integer  "user_id"
    t.integer  "node_id"
    t.integer  "right_id"
    t.datetime "created_at"
    t.datetime "updated_at"
  end

  create_table "received", :force => true do |t|
    t.text "text"
  end

  create_table "relations", :force => true do |t|
    t.integer "context_id"
    t.text    "name"
    t.text    "type"
    t.string  "deleted",    :limit => 1
    t.integer "version"
    t.integer "kind",                    :default => 1, :null => false
  end

  create_table "rights", :force => true do |t|
    t.string  "deleted",     :limit => 1
    t.integer "node"
    t.integer "user"
    t.integer "role"
    t.text    "name",                     :null => false
    t.text    "description",              :null => false
  end

  create_table "roles", :force => true do |t|
    t.text "name"
  end

  create_table "scripts", :force => true do |t|
    t.string   "name"
    t.text     "text"
    t.text     "description"
    t.integer  "user_id"
    t.integer  "current_id"
    t.datetime "created_at"
    t.datetime "updated_at"
  end

  create_table "statements", :force => true do |t|
    t.integer "Subject",    :limit => 8
    t.integer "Predicate",  :limit => 8
    t.integer "Object",     :limit => 8
    t.integer "user"
    t.integer "Modifier",   :limit => 8
    t.integer "inserted"
    t.string  "deleted",    :limit => 1
    t.integer "context_id", :limit => 8, :default => 103, :null => false
    t.integer "user_id",                 :default => 0,   :null => false
  end

  add_index "statements", ["Object"], :name => "Object"
  add_index "statements", ["Predicate"], :name => "Predicate"
  add_index "statements", ["Subject"], :name => "Subject"

  create_table "users", :force => true do |t|
    t.text    "name"
    t.text    "password"
    t.integer "context"
    t.string  "deleted",                   :limit => 1
    t.string  "salt",                                   :default => "", :null => false
    t.date    "activated_at"
    t.string  "crypted_password",                       :default => "", :null => false
    t.string  "activation_code",                        :default => "", :null => false
    t.date    "remember_token_expires_at",                              :null => false
    t.string  "password_reset_code",                    :default => "", :null => false
    t.date    "last_online",                                            :null => false
    t.string  "remember_token",                         :default => "", :null => false
    t.integer "online_counter",                                         :null => false
    t.string  "login",                                  :default => "", :null => false
    t.string  "state",                                  :default => "", :null => false
    t.string  "email",                                  :default => "", :null => false
  end

  create_table "users_contexts", :id => false, :force => true do |t|
    t.integer "context"
    t.integer "user"
  end

  create_table "values", :force => true do |t|
    t.integer "node_id"
    t.integer "version"
    t.binary  "value"
    t.integer "kind",    :default => 1
    t.integer "date"
    t.integer "editor"
    t.integer "user_id", :default => 1
  end

  create_table "variables", :force => true do |t|
    t.string   "name"
    t.string   "default"
    t.integer  "context_id"
    t.integer  "kind_id"
    t.integer  "method_id"
    t.datetime "created_at"
    t.datetime "updated_at"
  end

end
